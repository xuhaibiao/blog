package cn.xhb.blog.service;

import cn.xhb.blog.po.User;

/**
 * @author HaibiaoXu
 * @date Create in 14:56 2020/2/4
 * @modified By
 */
public interface UserService {

    User checkUser(String username, String passwored);
}
