package com.afei.springboot.basis.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring 异步使用
 * @author shihengfei
 */
@Slf4j
@RestController
public class SpringAsyncController {

    @Autowired
    AsyncTask asyncTask;

    @RequestMapping("asyncMethod")
    public String asyncMethod(){
        long startTime = System.currentTimeMillis();
        asyncTask.asyncStart();
        long endTime = System.currentTimeMillis();
        log.info("异步耗时:" + (endTime - startTime) + "ms");
        return (endTime - startTime) + "ms";
    }

    @RequestMapping("syncMethod")
    public String syncMethod(){
        long startTime = System.currentTimeMillis();
        asyncTask.syncStart();
        long endTime = System.currentTimeMillis();
        log.info("同步耗时:" + (endTime - startTime) + "ms");
        return (endTime - startTime) + "ms";
    }
}
