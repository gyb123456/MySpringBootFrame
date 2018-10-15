package com.demo.gyb;

import com.demo.gyb.config.IotProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication //一个复合注解，包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration
@EnableTransactionManagement //使事务生效
//@EnableCaching //使自定义配置生效
@EnableConfigurationProperties({IotProperties.class}) //使得自定义IotProperties类的配置有效
@ServletComponentScan //使自定义Listener生效
@MapperScan("com.demo.gyb.dao") //配置mybatis扫描的mapper路径

public class GybApplication {

    public static void main(String[] args) {
        SpringApplication.run(GybApplication.class, args);
    }
}
