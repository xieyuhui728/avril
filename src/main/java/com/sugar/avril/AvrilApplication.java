package com.sugar.avril;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;


/**
 * SpringBootApplication:
 *  @Configuration的注解类标识这个类可以使用Spring IoC容器作为bean定义的来源。
 *  @ComponentScan：会自动扫描指定包下的全部标有@Component的类，并注册成bean，当然包括@Component下的子注解@Service,@Repository,@Controller。
 *  @EnableAutoConfiguration：能够自动配置spring的上下文，试图猜测和配置你想要的bean类，通常会自动根据你的类路径和你的bean定义自动配置。
 *
 * ServletComponentScan :Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
 *
 * EnableScheduling: 开启定时任务
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.sugar.avril.mapper")
@EnableScheduling
public class AvrilApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvrilApplication.class, args);
    }

    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String passWord;
    @Value("${spring.datasource.driver-class-name}")
    String driverClassName;

    /**
     * Description: 自定义DataSource
     *
     * @param:
     * @return:
     * @auther: xieyuhui
     * @date: 2019-01-06 12:12
     * destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
     */
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        //用户名
        dataSource.setUsername(userName);
        //密码
        dataSource.setPassword(passWord);
        dataSource.setDriverClassName(driverClassName);
        //初始化时建立物理连接的个数
        dataSource.setInitialSize(2);
        //最大连接池数量
        dataSource.setMaxActive(20);
        //最小连接池数量
        dataSource.setMinIdle(0);
        //获取连接时最大等待时间，单位毫秒。
        dataSource.setMaxWait(60000);
        //用来检测连接是否有效的sql
        dataSource.setValidationQuery("SELECT 1");
        //申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestOnBorrow(false);
        //建议配置为true，不影响性能，并且保证安全性。
        dataSource.setTestWhileIdle(true);
        //是否缓存preparedStatement，也就是PSCache
        dataSource.setPoolPreparedStatements(false);
        return dataSource;
    }

}

