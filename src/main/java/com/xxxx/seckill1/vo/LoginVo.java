package com.xxxx.seckill1.vo;

import com.xxxx.seckill1.validator.IsMobile;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;
/**
 *功能描述：登录注解
 *@Author:hyp
 */
@Data
public class LoginVo {
    @NotNull
    @IsMobile
    private String mobile;
    @NotNull
    @Length(min = 32)
    private String password;
}
