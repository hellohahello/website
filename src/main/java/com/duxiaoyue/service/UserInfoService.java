package com.duxiaoyue.service;

import com.duxiaoyue.entity.UserInfo;

/**
 * @author 一笑奈何
 * @create 2019-04-11 9:21
 * @desc
 * @Version 1.0
 **/
public interface UserInfoService {
        UserInfo findByNameAndPassword(String loginName,String passWord);
}
