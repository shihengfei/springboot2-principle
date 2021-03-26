package com.afei.springboot.basis.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 定义异步任务
 * @author shihengfei
 */
@Slf4j
@Component
public class AsyncTask {

    @Async("asyncThreadPoolTaskExecutor")
    public void asyncStart() {
        try {
            log.info("异步任务启动...");
            Thread.sleep(10000);
            log.info(Thread.currentThread().getName());
            log.info("异步任务结束...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void syncStart() {
        try {
            log.info("同步任务启动...");
            Thread.sleep(10000);
            log.info("同步任务结束...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
