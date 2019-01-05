package com.sugar.avril.filter;


import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-04 21:01
 * @Description: spring boot filter
 * webFilter：通过注解的方式注册filter
 * order:多个filter执行的顺序，值越小优先级越高
 */
@Order(1)
@WebFilter(filterName = "avrilFilter", urlPatterns = "/thymeleaf/*")
public class AvrilFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("AvrilFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("AvrilFilter doFilter");
        //调用该方法后，表示过滤器经过原来的url请求处理方法
        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("AvrilFilter destroy");
    }
}
