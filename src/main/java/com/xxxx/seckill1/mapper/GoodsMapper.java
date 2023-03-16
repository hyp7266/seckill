package com.xxxx.seckill1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.seckill1.pojo.Goods;
import com.xxxx.seckill1.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 * 小小小韩
 *
 * @author hyp
 *
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    //获取商品列表
    List<GoodsVo> findGoodsVo();
    //获取商品详情
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
