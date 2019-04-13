package com.duxiaoyue.controller;

import com.duxiaoyue.entity.UserInfo;
import com.duxiaoyue.exception.PengException;
import com.duxiaoyue.service.UserInfoService;
import com.duxiaoyue.utils.Result;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 一笑奈何
 * @create 2019-04-11 9:26
 * @desc
 **/
@Controller
@RequestMapping("/user")
public class UserInfoContrller {
    // 在类下添加这句话
    private Logger log = Logger.getLogger(this.getClass());
@Resource(name = "userInfoService")
    private UserInfoService userInfoService;
@RequestMapping("/login.action")
/*
后台首页
 */
public String toLogin(){
    return "admin/login/login";
}
/*
后台首页
 */
@RequestMapping("/index.action")
    public String index(){
    log.debug("debug来了");
    log.info("info来了");
    log.error("error来了");
//    userInfoService.findByNameAndPassword("杜小月","duxiaoyue");
    return "/admin/index";
}

@RequestMapping("login.json")
@ResponseBody
    public Result login2(@RequestParam(value = "loginName") String username, String password, HttpServletRequest request) throws PengException {
            //校验不能为空
    if (StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
//            return Result.defeat("用户名或密码不能为空");
        throw new PengException("用户名,密码不能为空");
    }
            //用户名密码是否正确
    UserInfo userInfo=userInfoService.findByNameAndPassword(username,password);
    if (userInfo==null){
//        return Result.defeat("用户名或密码错误");
        throw new PengException("用户名或密码错误");
    }
    //都满足了把用户信息存入到session,返回0
    request.getSession().setAttribute("userInfo",userInfoService.findByNameAndPassword(username,password));
    return Result.success();
}

/*
退出登录
 */
@RequestMapping("loginout")
    public String loginOut(HttpSession session){
    /*
    销毁session
     */
    session.invalidate();
    return "/admin/login/login";
}

//@RequestMapping("login.action")
//    public String login(String username,String password){
//    //用户名和密码为空时,跳转到登录页
//        if (StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
//            return "login";
//        }
//        /*
//        用户名和密码错误,跳转到登录页
//         */
//        if (null==userInfoService.findByNameAndPassword(username,password)){
//            return "login";
//        }
//        return "home";
//}
}
