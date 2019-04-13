package com.duxiaoyue.dao.userinfomapper;

import com.duxiaoyue.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author 一笑奈何
 * @create 2019-04-11 9:15
 * @desc
 * @Version 1.0
 **/
public interface UserInfoDao {
    /*
    DAo层接口方法形参有多个参数时,要用param标识
     */
    UserInfo selectUser(@Param("loginName")String loginName,@Param("passWord")String passWord);
}
