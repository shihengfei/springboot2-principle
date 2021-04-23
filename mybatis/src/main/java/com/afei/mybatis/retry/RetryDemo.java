package com.afei.mybatis.retry;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试重试
 * @author shihengfei
 */
@Service
public class RetryDemo {

    private int account = 0;

    /**
     * 重试注解，
     *  value 那种异常需要重试
     *  maxAttempts 重试次数
     *  backoff 重试等待策略，默认使用 @Backoff，@Backoff的value默认为1000L 毫秒
     * @return
     */
    @Retryable(value = {Exception.class },
            maxAttempts = 3,
            backoff = @Backoff(delay = 1000))
    public String service(Boolean retry){
        account ++;
        if (retry){
            System.out.println("第"+account+"次");
            throw new RuntimeException("异常");
        }
        return "成功";
    }

}
