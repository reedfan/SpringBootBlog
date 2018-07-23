/**
 * Created by IntelliJ IDEA.
 * User: Kyrie
 * DateTime: 2018/7/23 14:26
 **/
package com.wip.service.user;

import com.wip.model.UserDomain;

public interface UserService {

    /**
     * 用户登录
     * @param username  用户名
     * @param password  密码
     * @return
     */
    UserDomain login(String username, String password);
}