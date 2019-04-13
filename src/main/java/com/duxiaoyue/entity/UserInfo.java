package com.duxiaoyue.entity;

import lombok.Data;

/**
 * @author 一笑奈何
 * @create 2019-04-11 9:13
 * @desc
 **/
@Data
public class UserInfo {
    /*
    主键ID,自增长
     */
    private Integer id;
    /*
    登录名
     */
    private String loginName;
    /*
    密码
     */
    private String passWord;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public UserInfo() {
    }

    public UserInfo(Integer id, String loginName, String passWord) {

        this.id = id;
        this.loginName = loginName;
        this.passWord = passWord;
    }
}
