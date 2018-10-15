package com.demo.gyb.service;

import com.demo.gyb.dao.device.GatewayInfoMapper;
import com.demo.gyb.entity.device.GatewayInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    GatewayInfoMapper mapper;

    public String test(){
        GatewayInfo gatewayInfo =  mapper.queryByMacId("EE99BB04D3BF");
        System.out.println("gatewayInfo"+gatewayInfo.getCreateTime());
       return gatewayInfo.getNetworkId();
    }
}
