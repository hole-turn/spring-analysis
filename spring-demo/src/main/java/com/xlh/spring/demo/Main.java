package com.xlh.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: xielinhao
 * @title: Main
 * @projectName: spring
 * @description:
 * @date: 9:12 2021/9/17
 */
public class Main {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.xlh.spring.demo");
//		AService bean = applicationContext.getBean(AService.class);
//		bean.A();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		A bean = context.getBean(A.class);
		System.out.println(bean.getId());
	}
}
