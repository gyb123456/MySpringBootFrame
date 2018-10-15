package com.demo.gyb.ctrl;

import com.demo.gyb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aaa")
public class TestCtrl {
    @Autowired
    TestService testService;
    @RequestMapping("/aaa")
    public String test(){
        return "hello  sss";
    }

    @RequestMapping("/bbb")
    public String bbb(){
       String id =  testService.test();
       return "gatewayInfo.getNetworkId:"+id;
    }
}
