package com.zZooper.service.impl;

import com.zZooper.service.DubboProviderService;
import org.springframework.stereotype.Service;

public class DubboProviderServiceImpl implements DubboProviderService{
    public String sayHello(String name) {
        return "hello" + name;
    }
}
