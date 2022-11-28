package com.xlh.spring.demo.processor;

import com.xlh.spring.demo.processor.config.ProcessConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xielinhao
 * @title: MyTests
 * @projectName: spring
 * @description:
 * @date: 10:04 2022/11/23
 */
public class MyTests {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProcessConfig.class);
	}
}
