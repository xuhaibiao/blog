package cn.xhb.blog.service;

import cn.xhb.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author HaibiaoXu
 * @date Create in 19:29 2020/2/4
 * @modified By
 */
public interface TagService {

    Tag saveTag(Tag type);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);

    List<Tag> listTag();

    Tag updateTag(Long id, Tag type);

    void deleteTag(Long id);
}
