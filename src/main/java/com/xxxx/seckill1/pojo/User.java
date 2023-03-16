package com.xxxx.seckill1.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 * 小小小韩
 *
 * @author hyp
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user") //下面的implement没有自动生成
public class User implements Serializable {//extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nickname;

    /**
     * MDS(MDS(pass明文+固定salt)+salt)
     */
    private String password;

    private String slat;

    /**
     * 头像
     */
    private String head;

    /**
     * 最后一次登录时间
     */
    private Date registerDate;

    /**
     * 最后一次登录时间
     */
    private Date lastLoginDate;

    /**
     * 登录次数
     */
    private Integer loginCount;


}
