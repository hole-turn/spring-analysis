package com.xlh.spring.demo.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: xielinhao
 * @title: MyBeanDefinitionRegistryPostProcessor
 * @projectName: spring
 * @description:
 * @date: 9:59 2022/11/23
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	public MyBeanDefinitionRegistryPostProcessor() {
		System.out.println("MyBeanDefinitionRegistryPostProcessor");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanDefinitionRegistryPostProcessor->postProcessBeanFactory");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("BeanDefinitionRegistryPostProcessor->postProcessBeanDefinitionRegistry");
	}
}
