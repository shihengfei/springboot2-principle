package com.afei.mybatis;

import com.afei.mybatis.product.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class RabbitTests {

	@Autowired
	Sender sender;
	@Test
	void send() {
		IntStream.rangeClosed(0,20).forEach(item -> {
			sender.send();
		});
	}

}
