package cn.xhb.blog.dao;

import cn.xhb.blog.po.Tag;
import cn.xhb.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * @author HaibiaoXu
 * @date Create in 21:01 2020/2/4
 * @modified By
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
