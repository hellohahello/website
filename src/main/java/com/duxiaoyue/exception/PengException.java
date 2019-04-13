package com.duxiaoyue.exception;

import lombok.Data;

/**
 * @author 一笑奈何
 * @create 2019-04-12 19:09
 * @desc 全局异常处理------预期异常---我们知道可能会出异常....用户名为空...密码不对等
 **/
@Data
public class PengException extends Exception {
    /*
    消息
     */
    private String message;
/*
构造方法
 */
    public PengException(String message) {
        super(message);
        this.message = message;
    }

}
