package com.sugar.avril.controller;

import com.sugar.avril.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-04 20:51
 * @Description: 只需要类添加  @RestController  即可，默认类中的方法都会以json的格式返回
 */
@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/")
    public User json() {
        User user = new User();
        user.setName("谢宇辉");
        user.setAge(28);
        return user;
    }
}
