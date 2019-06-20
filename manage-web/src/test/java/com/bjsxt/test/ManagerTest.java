package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:http://www.cqt.com
 * @Date:2019/6/20
 * @Description:com.bjsxt.test
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users user = new Users();
        user.setUsername("hh");
        user.setUserage(23);
        usersMapper.insertUser(user);
    }
}
