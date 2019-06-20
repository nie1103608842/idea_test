package com.bjsxt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:http://www.cqt.com
 * @Date:2019/6/20
 * @Description:com.bjsxt.web.controller
 * @version:1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
