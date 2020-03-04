package cn.xhb.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author HaibiaoXu
 * @date Create in 23:09 2020/2/8
 * @modified By
 */
@Controller
public class AboutController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
