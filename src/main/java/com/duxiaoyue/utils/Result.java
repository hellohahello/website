package com.duxiaoyue.utils;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 一笑奈何
 * @create 2019-04-12 15:01
 * @desc 统一json数据格式
 **/
@Data
public class Result {
    //状态码
    private Integer code;
    //消息
    private String message;
//    数据
    private Map<String,Object> data=new HashMap<>();


    /*
    响应成功结果
     */
    public static Result success() {
         Result result=new Result();
         result.setCode(0);
         result.setMessage("操作成功");
        return result;
    }
    /*
    响应失败时的结果
     */
    public static Result defeat(String str){
       Result result=new Result();
       result.setCode(999);
        if (StringUtils.isEmpty(str)){
            result.setMessage("操作失败");
        }
        result.setMessage(str);
        return result;
    }
    /*
    向data添加map数据
     */
    public Result addData(String key,Object value){
            this.getData().put(key,value);
            return this;
    }
}
