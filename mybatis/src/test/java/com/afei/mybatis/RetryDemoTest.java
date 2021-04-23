package com.afei.mybatis;

import com.afei.mybatis.retry.RetryDemo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RetryDemoTest {

    @Autowired
    RetryDemo retryDemo;

    @Test
    public void retryTest() throws InterruptedException {
        Runnable runnable = () -> retryDemo.service(true);
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread2.start();
        Thread.sleep(10000L);
    }
}
