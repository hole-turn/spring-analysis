package com.xlh.spring.demo.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author: xielinhao
 * @title: MySmartInstantiationAwareBeanPostProcessor
 * @projectName: spring
 * @description:
 * @date: 13:39 2022/11/23
 */
@Component
//bean进行代理增强期间进行使用
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwareBeanPostProcessor() {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor init");
	}

	//预测bean的类型，最后一次改变组件类型
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor->predictBeanType");
		return null;
	}

	//返回我们要使用的构造器候选列表
	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor->determineCandidateConstructors");
		//返回一个我们指定的构造器
//		return new Constructor[0];
		return null;
	}

	//返回早期的bean引用
	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor->getEarlyBeanReference");
		return null;
	}
}
