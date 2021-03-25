package com.afei.controller;

import com.afei.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shihengfei
 */
@RestController
public class DemoController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello(){
        return helloService.hello();
    }
}
