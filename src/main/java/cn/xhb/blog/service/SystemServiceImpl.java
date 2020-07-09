package cn.xhb.blog.service;

import cn.xhb.blog.dao.SystemRepository;
import cn.xhb.blog.po.System;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HaibiaoXu
 * @date Create in 16:23 2020/5/31
 * @modified By
 */
@Service
public class SystemServiceImpl implements SystemService{
    @Autowired
    SystemRepository systemRepository;
    @Override
    public int getCount() {
        if (systemRepository.count() == 0) {
            System system = new System();
            system.setCount(0);
            system.setId(1L);
            systemRepository.save(system);
            return 0;
        } else {
            return systemRepository.findById(20L).get().getCount();
        }

    }

    @Override
    public void updateCount(Long id) {
        systemRepository.updateCount(id);
    }
}
