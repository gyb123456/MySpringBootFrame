package com.demo.gyb;

import com.demo.gyb.config.IotProperties;
import com.demo.gyb.service.RedisService;
import com.demo.gyb.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GybApplicationTests {

    @Autowired
    RedisService redisService;
    @Autowired
    TestService testService;
    @Autowired
    IotProperties iotProperties;
    @Test
    public void contextLoads() {
//        testService.test();

//        redisService.writeRedis("gyb2","gyb221");
//        String readRedis = redisService.readRedis("gyb2");
//        System.out.println("readRedis="+readRedis);

        String prop = iotProperties.getFirmware_update_port();
        System.out.println("prop="+prop);
    }

    @Test
    public void md5() {

    }

}
