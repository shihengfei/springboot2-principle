package com.afei.auto.controller;

import com.afei.auto.model.Pension;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

    @RequestMapping("/persion")
    public Pension persion(){
        int i = 10/0;
        Pension persion = new Pension();
        persion.setAge(12);
        persion.setName("是非");
        return persion;
    }
}
