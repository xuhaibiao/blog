package cn.xhb.blog.service;

import cn.xhb.blog.po.User;
import cn.xhb.blog.dao.UserRepository;
import cn.xhb.blog.service.UserService;
import cn.xhb.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HaibiaoXu
 * @date Create in 14:57 2020/2/4
 * @modified By
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username,  MD5Utils.code(password));
        return user;
    }
}
