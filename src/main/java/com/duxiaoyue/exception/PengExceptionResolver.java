package com.duxiaoyue.exception;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 一笑奈何
 * @create 2019-04-12 19:16
 * @desc 全局异常处理
 **/
public class PengExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                          Object o,
                                         Exception e) {
//obj:  发生异常的地方:  比如在service层:会显示  ====>包名+类名+方法名(形参)
//e:    抛出异常的类型: 运行时,预期的还是你不知道的

        //打印错误信息到控制台
        e.printStackTrace();
        String message="系统繁忙,请稍后再试";
        
        HandlerMethod handlerMethod = (HandlerMethod) o;
//        RestController restController = handlerMethod.getMethod().getAnnotation(RestController.class);
        ResponseBody responseBody = handlerMethod.getMethod().getAnnotation(ResponseBody.class);
        //判断请求类型
        //0. 如果是预期的异常,返回json格式的错误消息
            if (e instanceof PengException){
                message = ((PengException) e).getMessage();
            }
        //        1.如果是json请求,返回json数据
            if (responseBody!=null){
                Map<String,Object> data=new HashMap<>();
                data.put("code",999);
                data.put("message",message);
                //把map转化成json
                Gson gson=new Gson();
                String json = gson.toJson(data);
                //设置json的编码格式
                httpServletResponse.setContentType("application/json; charset=utf-8");
                httpServletResponse.setCharacterEncoding("utf-8");
                try {
                    httpServletResponse.getWriter().write(json);
                    httpServletResponse.getWriter().flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                // 返回一个空的ModelAndView表示已经手动生成响应
                return new ModelAndView();
            }
        //如果是跳转页面的请求,则跳转到错误页面
        ModelAndView modelAndView=new ModelAndView();
            modelAndView.setViewName("commons/error");
            modelAndView.addObject("message",message);
        return modelAndView;
    }
}
