package com.sugar.avril;

import com.sugar.avril.mapper.UserMapper;
import com.sugar.avril.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-06 16:08
 * @Description:
 */
public class UserMapperTest extends AvrilApplicationTests {

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
