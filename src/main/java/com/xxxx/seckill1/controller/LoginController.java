package com.xxxx.seckill1.controller;

import com.xxxx.seckill1.service.IUserService;
import com.xxxx.seckill1.vo.LoginVo;
import com.xxxx.seckill1.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 *功能描述：跳转登录页面
 *
 *@param
 *@return
 *
 *@Author:hyp
 */
//@RestController//会给这个类下的所有方法，加responsebody来返回对象而不是页面跳转
@Controller
@RequestMapping("/login")//login/tologin
@Slf4j//所以下面可以直接用log.info日志
public class LoginController {
    @Autowired//都要将属性中的类属性注解
    private IUserService userService;
    @RequestMapping("/tologin")
    public String tologin(){
        return "login";//找到templates下的login.html
    }
    @RequestMapping("/doLogin")//要有公共的返回对象是什么意
    @ResponseBody//返回respBean的必须
    public RespBean doLogin(@Valid LoginVo loginVo, HttpServletRequest request,HttpServletResponse response){//html中输入账号密码后转的
        //log.info("{}",loginVo);日志用来查看是否能收dao
        return userService.doLogin(loginVo,request,response);
    }

}
