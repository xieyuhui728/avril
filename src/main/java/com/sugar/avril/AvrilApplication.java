package com.sugar.avril;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


@SpringBootApplication
@ServletComponentScan
@MapperScan("com.sugar.avril.mapper")
public class AvrilApplication {

    public static void main(String[] args) {
        SpringApplication.run(AvrilApplication.class, args);
    }

//    @Value("${spring.datasource.url}")
//    String url;
//    @Value("${spring.datasource.username}")
//    String userName;
//    @Value("${spring.datasource.password}")
//    String passWord;
//    @Value("${spring.datasource.driver-class-name}")
//    String driverClassName;

    /**
     * Description: 自定义DataSource
     *
     * @param:
     * @return:
     * @auther: xieyuhui
     * @date: 2019-01-06 12:12
     * destroy-method="close"的作用是当数据库连接不使用的时候,就把该连接重新放到数据池中,方便下次使用调用.
     */
//    @Bean(destroyMethod = "close")
//    public DataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        //用户名
//        dataSource.setUsername(userName);
//        //密码
//        dataSource.setPassword(passWord);
//        dataSource.setDriverClassName(driverClassName);
//        //初始化时建立物理连接的个数
//        dataSource.setInitialSize(2);
//        //最大连接池数量
//        dataSource.setMaxActive(20);
//        //最小连接池数量
//        dataSource.setMinIdle(0);
//        //获取连接时最大等待时间，单位毫秒。
//        dataSource.setMaxWait(60000);
//        //用来检测连接是否有效的sql
//        dataSource.setValidationQuery("SELECT 1");
//        //申请连接时执行validationQuery检测连接是否有效
//        dataSource.setTestOnBorrow(false);
//        //建议配置为true，不影响性能，并且保证安全性。
//        dataSource.setTestWhileIdle(true);
//        //是否缓存preparedStatement，也就是PSCache
//        dataSource.setPoolPreparedStatements(false);
//        return dataSource;
//    }

}

