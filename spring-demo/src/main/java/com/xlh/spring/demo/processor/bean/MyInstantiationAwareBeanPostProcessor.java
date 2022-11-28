package com.xlh.spring.demo.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: xielinhao
 * @title: MyInstantiationAwareBeanPostProcessor
 * @projectName: spring
 * @description:
 * @date: 13:32 2022/11/23
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("MyInstantiationAwareBeanPostProcessor init");
	}

	//初始化之前进行后置处理，Spring留给我们给这个组件创建对象的回调。
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor->postProcessBeforeInstantiation");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor->postProcessAfterInstantiation"); //提前改变一些Spring不管的bean里面的属性
		return true; //返回false则bean的赋值全部结束
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor->postProcessProperties");
		return null;
	}
}
