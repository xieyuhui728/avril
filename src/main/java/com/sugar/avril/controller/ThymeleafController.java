package com.sugar.avril.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: xieyuhui
 * @Date: 2018-12-31 15:09
 * @Description: spring boot thymeleaf
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("homeMessage","this is thymeleaf home~");
        return modelAndView;
    }
}
