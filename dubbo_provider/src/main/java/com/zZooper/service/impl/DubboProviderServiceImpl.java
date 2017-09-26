package com.zZooper.service.impl;

import com.zZooper.service.DubboProviderService;
import org.springframework.stereotype.Service;

import java.net.InetAddress;

public class DubboProviderServiceImpl implements DubboProviderService{
    public String sayHello(String name) throws Exception{
        return "hello！nihao" + name + "访问服务器地址为:" + InetAddress.getLocalHost().getHostAddress()+"本地";
    }
}
