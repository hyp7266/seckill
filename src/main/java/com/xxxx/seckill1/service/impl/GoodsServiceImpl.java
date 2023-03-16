package com.xxxx.seckill1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.seckill1.mapper.GoodsMapper;
import com.xxxx.seckill1.pojo.Goods;
import com.xxxx.seckill1.service.IGoodsService;
import com.xxxx.seckill1.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
    @Autowired//数据库查询
    private GoodsMapper goodsMapper;

    @Override//获取商品列表
    public List<GoodsVo> findGoodsVo() {
        return goodsMapper.findGoodsVo();
    }

    @Override//获取商品详情
    public GoodsVo findGoodsVoByGoodsId(Long goodsId) {
        return goodsMapper.findGoodsVoByGoodsId(goodsId);
    }
    /**
     *功能描述：获取商品列表
     *@Author:hyp
     */

}
