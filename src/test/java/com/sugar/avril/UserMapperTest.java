package com.sugar.avril;

import com.sugar.avril.mapper.UserMapper;
import com.sugar.avril.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-06 16:08
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest{

    @Autowired
    private UserMapper userMapper;

    //    @Test
//    public void insert() {
//        User user = new User();
//        user.setCname("自来也");
//        user.setAge(128);
//        userMapper.insert(user);
//    }
//
//    @Test
//    public void getOne() {
//        User user = userMapper.getOne(1);
//        System.out.println(user.toString());
//    }
    @Test
    public void test() {
        userMapper.getTest();
    }
}
