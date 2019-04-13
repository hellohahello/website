package com.duxiaoyue.service.impl;

import com.duxiaoyue.dao.userinfomapper.UserInfoDao;
import com.duxiaoyue.entity.UserInfo;
import com.duxiaoyue.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 一笑奈何
 * @create 2019-04-11 9:24
 * @desc
 **/
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByNameAndPassword(String loginName, String passWord) {
     return userInfoDao.selectUser(loginName,passWord);
    }
}
