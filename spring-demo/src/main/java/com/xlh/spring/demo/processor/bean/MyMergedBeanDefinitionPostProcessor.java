package com.xlh.spring.demo.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author: xielinhao
 * @title: MyMergedBeanDefinitionPostProcessor
 * @projectName: spring
 * @description:
 * @date: 13:43 2022/11/23
 */
@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	public MyMergedBeanDefinitionPostProcessor() {
		System.out.println("MyMergedBeanDefinitionPostProcessor init");
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor->postProcessMergedBeanDefinition");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyMergedBeanDefinitionPostProcessor->postProcessBeforeInitialization");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyMergedBeanDefinitionPostProcessor->postProcessAfterInitialization");
		return null;
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor->resetBeanDefinition");
	}
}
