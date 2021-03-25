package com.afei.auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author shihengfei
 * @SpringBootApplication - 组合注解
 * 	- @EnableAutoConfiguration 			启动自动配置功能
 * 		- @AutoConfigurationPackage 	自动配置包、默认扫描 application 同级以及下层包
 * 		- @Import(AutoConfigurationImportSelector.class)	按需加载、
 *  - @ComponentScan	扫描包
 */
@ServletComponentScan("com.afei.auto")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		// 获取上下文容器组件
//		String[] beanDefinitionNames = run.getBeanDefinitionNames();
//		for (String beanDefinitionName : beanDefinitionNames) {
//			System.out.println(beanDefinitionName);
//		}
//		int beanDefinitionCount = run.getBeanDefinitionCount();
//		System.out.println("组件数量:"+beanDefinitionCount);

	}

}
