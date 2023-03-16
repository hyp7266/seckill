package com.xxxx.seckill1.controller;


import com.xxxx.seckill1.pojo.User;
import com.xxxx.seckill1.vo.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import 你自己的父类控制器,没有就不用设置!;

/**
 * <p>
 *  前端控制器
 * </p>
 * 小小小韩
 *
 * @author hyp
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {//extends 你自己的父类控制器,没有就不用设置! {
    @RequestMapping("/info")
    @ResponseBody
    public RespBean info(User user){
        return RespBean.success(user);
    }

}
