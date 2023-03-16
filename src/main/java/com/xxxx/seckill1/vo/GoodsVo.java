package com.xxxx.seckill1.vo;

import com.xxxx.seckill1.pojo.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 *功能描述：商品返回对象
 *@Author:hyp
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsVo extends Goods {

	private BigDecimal seckillPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
}