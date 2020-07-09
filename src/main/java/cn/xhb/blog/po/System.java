package cn.xhb.blog.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author HaibiaoXu
 * @date Create in 16:19 2020/5/31
 * @modified By
 */
@Entity
@Table(name = "t_system")
public class System {
    @Id
    @GeneratedValue
    private Long id;

    private Integer count;

    public System() {

    }
    public System(Long id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
