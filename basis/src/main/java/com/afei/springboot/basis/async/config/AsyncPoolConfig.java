package com.afei.springboot.basis.async.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 异步线程池配置
 * @author shihengfei
 */
@Configuration
public class AsyncPoolConfig {

    @Bean("asyncThreadPoolTaskExecutor")
    public ThreadPoolTaskExecutor asyncThreadPoolTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 线程池核心线程的数量，默认值为1（这就是默认情况下的异步线程池配置使得线程不能被重用的原因）
        executor.setCorePoolSize(5);
        // 线程池维护的线程的最大数量，只有当核心线程都被用完并且缓冲队列满后，才会开始申超过请核心线程数的线程，默认值为Integer.MAX_VALUE
        executor.setMaxPoolSize(20);
        // 缓冲队列
        executor.setQueueCapacity(20);
        // 超出核心线程数外的线程在空闲时候的最大存活时间，默认为60秒。
        executor.setKeepAliveSeconds(200);
        // 线程池线程名称前缀
        executor.setThreadNamePrefix("asyncThread");
        // 是否等待所有线程执行完毕才关闭线程池，默认值为false。
        executor.setWaitForTasksToCompleteOnShutdown(true);
        // waitForTasksToCompleteOnShutdown的等待的时长，默认值为0，即不等待。
        executor.setAwaitTerminationSeconds(60);
        // 当没有线程可以被使用时的处理策略（拒绝任务），默认策略为abortPolicy，包含下面四种策略：
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}
