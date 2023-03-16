package com.xxxx.seckill1.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *功能描述：公共返回对象
 *@param:
 *@return:
 *
 *@Author:hyp
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespBean {
    private long code;
    private String message;
    private Object obj;
    /**
     *功能描述：成功返回结果
     *@param:
     *@return:
     *
     *@Author:hyp
     */
    public static RespBean success(){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),RespBeanEnum.SUCCESS.getMessage(), null);
    }
    public static RespBean success(Object obj){
        return new RespBean(RespBeanEnum.SUCCESS.getCode(),RespBean.success().getMessage(), obj);
    }
    /**
     *功能描述：失败返回结果
     *@param:
     *@return:
     *
     *@Author:hyp
     */
    //这里传入枚举的原因是成功只有一种，失败有404等多种
    public static RespBean error(RespBeanEnum respBeanEnum){
        return new RespBean(respBeanEnum.getCode(),respBeanEnum.getMessage(), null);
    }
    public static RespBean error(RespBeanEnum respBeanEnum,Object obj){
        return new RespBean(respBeanEnum.getCode(),respBeanEnum.getMessage(), obj);
    }
}
