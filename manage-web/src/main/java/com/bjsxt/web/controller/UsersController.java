package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:http://www.cqt.com
 * @Date:2019/6/20
 * @Description:com.bjsxt.web.controller
 * @version:1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users user){
        usersService.addUser(user);
        return "ok";
    }
}
