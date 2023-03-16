package com.xxxx.seckill1.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 *功能描述：公共返回对象枚举
 *@param:
 *@return:
 *
 *@Author:hyp
 */
@Getter //getset
@ToString
@AllArgsConstructor //全参构造
public enum RespBeanEnum {
    //通用
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务器异常"),
    //登录模块
    LOGIN_ERROR(500210,"用户名密码错误"),
    MOBILE_ERROR(500211,"手机格式不正确"),
    BIND_ERROR(500212,"参数校验异常"),
    EMPTY_STOCK(500500,"库存不足"),
    REPEATE_ERROR(500501,"该商品每人限购一件"),
    MOBILE_NOT_EXIST(500213,"手机号码不存在" ),
    PASSWORD_UPDATE_FAIL(500214,"密码更新失败" );
    private final Integer code;
    private final String message;
}
