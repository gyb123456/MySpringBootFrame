package com.demo.gyb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
/**
 * 使得自定义配置文件.property的内容可被获取
 * 20180821 GYB
*/
@Configuration
//配置变量前缀
@ConfigurationProperties(prefix="iot")
//配置单个配置文件
//@PropertySource("classpath:application-dev.properties")
//配置多个配置文件
@PropertySources({
        @PropertySource("classpath:application-dev.properties"),
        @PropertySource("classpath:application-prod.properties"),
        @PropertySource("classpath:application-preview.properties")
})
public class IotProperties {
    private String firmware_update_port;


    public String getFirmware_update_port() {
        return firmware_update_port;
    }

    public void setFirmware_update_port(String firmware_update_port) {
        this.firmware_update_port = firmware_update_port;
    }

}
