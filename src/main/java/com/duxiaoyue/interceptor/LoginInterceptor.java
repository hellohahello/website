package com.duxiaoyue.interceptor;

import com.duxiaoyue.entity.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 一笑奈何
 * @create 2019-04-12 9:46
 * @desc 后台页面拦截器
 **/

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //如果是请求登录,放行
        /*
        url:  http://localhost:8080/user/index.action#
        uri: index.action
         */
        if ( request.getRequestURI().contains("login")){
            return true;
        }
//        已经登录,不拦截
        UserInfo userInfo =(UserInfo) request.getSession().getAttribute("userInfo");
        if (null!=userInfo){
            return true;
        }
        //拦截后转发到登录页面
            request.getRequestDispatcher("/WEB-INF/page/admin/login/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
