package com.afei.springboot.basis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * springboot 小技巧
 * @author shihengfei
 */
@EnableAsync
@SpringBootApplication
public class BasisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasisApplication.class, args);
	}

}
