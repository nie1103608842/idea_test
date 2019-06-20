package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther:http://www.cqt.com
 * @Date:2019/6/20
 * @Description:com.bjsxt.service.impl
 * @version:1.0
 */
@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users user) {
        usersMapper.insertUser(user);
    }
}
