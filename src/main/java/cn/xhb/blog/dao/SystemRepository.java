package cn.xhb.blog.dao;

import cn.xhb.blog.po.System;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HaibiaoXu
 * @date Create in 14:58 2020/2/4
 * @modified By
 */

public interface SystemRepository extends JpaRepository<System, Long>{
    @Transactional
    @Modifying
    @Query("update System s set s.count = s.count + 1 where s.id = id")
    int updateCount(Long id);
}
