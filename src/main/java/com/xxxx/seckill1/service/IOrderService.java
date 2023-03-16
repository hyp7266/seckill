package com.xxxx.seckill1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill1.pojo.Order;
import com.xxxx.seckill1.pojo.User;
import com.xxxx.seckill1.vo.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 * 小小小韩
 *
 * @author hyp
 *
 */
public interface IOrderService extends IService<Order> {
    //秒杀
    Order seckill(User user, GoodsVo goods);
}
