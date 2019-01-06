package com.sugar.avril.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xieyuhui
 * @Date: 2018-12-30 22:44
 * @Description: 首页控制类
 */
@RestController
public class IndexController {

    @Value("${spring.profiles}")
    private String message;

    /**
     *
     * Description: 
     *
     * @param:
     * @return: 
     * @auther: xieyuhui
     * @date: 2018-12-30 22:52
     */
    @RequestMapping("/")
    public String index() {
        return message;
    }
}
