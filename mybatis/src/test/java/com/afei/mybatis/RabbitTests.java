package com.afei.mybatis;

import com.afei.mybatis.product.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class RabbitTests {

	@Autowired
	Sender sender;

	@Autowired
	RabbitTemplate rabbitTemplate;

	@Test
	void send() {
		IntStream.rangeClosed(0,20).forEach(item -> {
			sender.send();
		});
	}

	@Test
	public void send1() {
		String context = "hi, i am message 1";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
	}

	@Test
	public void send2() {
		String context = "hi, i am messages 2";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
	}
}
