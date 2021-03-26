package com.afei.springboot.basis;

import com.afei.springboot.basis.async.SpringAsyncController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasisApplicationTests {

	@Autowired
	SpringAsyncController springAsyncController;

	@Test
	public void asyncMethod(){
		springAsyncController.asyncMethod();
	}

	@Test
	public void syncMethod(){
		springAsyncController.syncMethod();
	}
}
