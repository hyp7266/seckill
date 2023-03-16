package com.xxxx.seckill1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.seckill1.mapper.OrderMapper;
import com.xxxx.seckill1.pojo.Order;
import com.xxxx.seckill1.pojo.SeckillGoods;
import com.xxxx.seckill1.pojo.SeckillOrder;
import com.xxxx.seckill1.pojo.User;
import com.xxxx.seckill1.service.IGoodsService;
import com.xxxx.seckill1.service.IOrderService;
import com.xxxx.seckill1.service.ISeckillGoodsService;
import com.xxxx.seckill1.service.ISeckillOrderService;
import com.xxxx.seckill1.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.DriverManager;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 * 小小小韩
 *
 * @author hyp
 *
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Autowired
    private ISeckillGoodsService seckillGoodsService;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ISeckillOrderService seckillOrderService;
    @Autowired
    private IGoodsService goodsService;

    //秒杀
    @Transactional//事务
    @Override
    public Order seckill(User user, GoodsVo goods) {
        //秒杀商品表库存
        SeckillGoods seckillGoods = seckillGoodsService.getOne(new QueryWrapper<SeckillGoods>().eq("goods_id", goods.getId()));
        seckillGoods.setStockCount(seckillGoods.getStockCount() - 1);
        //seckillGoodsService.updateById(seckillGoods);
        boolean result = seckillGoodsService.update(new UpdateWrapper<SeckillGoods>().setSql("stock_count = stock_count - 1")
                .eq("goods_id",goods.getId()).gt("stock_count",0));
        if(!result){
            return null;//说明更新失败
        }

        //生成订单
        Order order = new Order();
        order.setUserId(user.getId());
        order.setGoodsId(goods.getId());
        order.setDeliveryAddrId(0L);
        order.setGoodsName(goods.getGoodsName());
        order.setGoodsCount(1);
        order.setGoodsPrice(seckillGoods.getSeckillPrice());
        order.setOrderChannel(1);
        order.setStatus(0);
        order.setCreateDate(new Date());
        orderMapper.insert(order);
        //生成秒杀订单，有一个id生成关联
        SeckillOrder seckillOrder = new SeckillOrder();
        seckillOrder.setUserId(user.getId());
        seckillOrder.setOrderId(order.getId());
        seckillOrder.setGoodsId(goods.getId());
        seckillOrderService.save(seckillOrder);

        return order;

    }
}
