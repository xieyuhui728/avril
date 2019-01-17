package com.sugar.avril;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-10 21:38
 * @Description: 创建ServletInitializer.java，继承SpringBootServletInitializer ，覆盖configure()，把启动类Application注册进去。
 * 外部web应用服务器构建Web Application Context的时候，会把启动类添加进去。
 * <p>
 * 这个类的作用与在web.xml中配置负责初始化Spring应用上下文的监听器作用类似，只不过在这里不需要编写额外的XML文件了。
 */

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AvrilApplication.class);
    }

}

