package com.afei.service;

import com.afei.config.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 方法实现，此处不要注入容器中，通过自动配置类注入
 * @author shihengfei
 */
public class HelloService {

    @Autowired
    HelloProperties helloAutoConfiguration;

    public String hello(){
        return "hello:" + helloAutoConfiguration.getName();
    }
}
