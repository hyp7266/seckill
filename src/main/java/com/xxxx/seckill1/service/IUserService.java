package com.xxxx.seckill1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.seckill1.pojo.User;
import com.xxxx.seckill1.vo.LoginVo;
import com.xxxx.seckill1.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 * 小小小韩
 *
 * @author hyp
 *
 */
public interface IUserService extends IService<User> {
/**
 *功能描述：登录dologin
 *@param:
 *@return:
 *
 *@Author:hyp
 */
    RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
    /**
     *功能描述：根据cookie获取用户
     *@Author:hyp
     */
    User getUserByCookie(String userTicket,HttpServletRequest request,HttpServletResponse response);
    /**
     *功能描述：更新密码
     *@Author:hyp
     */
    RespBean updatePassword(String userTicket, String password, HttpServletRequest request,
                            HttpServletResponse response);
}
