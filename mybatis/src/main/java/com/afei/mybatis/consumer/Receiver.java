package com.afei.mybatis.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * @author shihengfei
 */
@RabbitListener(queues = "hello")
@Component
public class Receiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver:"+hello);
    }

}
