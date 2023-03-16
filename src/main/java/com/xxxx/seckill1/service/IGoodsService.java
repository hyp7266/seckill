package com.xxxx.seckill1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill1.pojo.Goods;
import com.xxxx.seckill1.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 * 小小小韩
 *
 * @author hyp
 *
 */
public interface IGoodsService extends IService<Goods> {

    /**
     *功能描述：获取商品列表
     *@Author:hyp
     */
    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
