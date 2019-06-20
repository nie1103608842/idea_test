package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther:http://www.cqt.com
 * @Date:2019/6/19
 * @Description:com.bjsxt.mapper
 * @version:1.0
 */
public interface UsersMapper {
    void insertUser(Users user);
    List<Users> selectUserAll();
}
