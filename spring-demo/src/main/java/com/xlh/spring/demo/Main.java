package com.xlh.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: xielinhao
 * @title: Main
 * @projectName: spring
 * @description:
 * @date: 9:12 2021/9/17
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.xlh.spring.demo");
		AService bean = applicationContext.getBean(AService.class);
		bean.A();
	}
}
