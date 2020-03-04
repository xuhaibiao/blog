package cn.xhb.blog.dao;

import cn.xhb.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HaibiaoXu
 * @date Create in 14:58 2020/2/4
 * @modified By
 */

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);

}
