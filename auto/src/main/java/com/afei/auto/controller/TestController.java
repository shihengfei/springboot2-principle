package com.afei.auto.controller;

import com.afei.auto.model.Pension;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {

    @RequestMapping("/rest")
    public Pension testREST(Pension persion){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","飞");
        return persion;
    }
}
