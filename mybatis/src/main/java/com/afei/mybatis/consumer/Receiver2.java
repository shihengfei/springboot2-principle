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
public class Receiver2 {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver2:"+hello);
    }

}
