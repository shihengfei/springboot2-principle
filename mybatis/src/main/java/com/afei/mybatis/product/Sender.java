package com.afei.mybatis.product;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 * @author shihengfei
 */
@Component
public class Sender {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(){
        String context = "发送者: "+ System.currentTimeMillis();
        amqpTemplate.convertAndSend("hello",context);
    }
}
