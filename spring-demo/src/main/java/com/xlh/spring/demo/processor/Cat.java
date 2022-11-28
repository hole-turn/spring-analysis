package com.xlh.spring.demo.processor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: xielinhao
 * @title: Cat
 * @projectName: spring
 * @description:
 * @date: 14:17 2022/11/23
 */
@Component
public class Cat implements InitializingBean {
	private String name;
	public Cat() {
		System.out.println("cat被创建了");
	}

	public String getName() {
		return name;
	}

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("cat...setName正在赋值调用");
		this.name = name;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CatInitializingBean...afterPropertiesSet()");
	}
}
