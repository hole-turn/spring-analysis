package com.xlh.spring.demo.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author: xielinhao
 * @title: MyBeanFactoryProcesser
 * @projectName: spring
 * @description:
 * @date: 9:54 2022/11/23
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor  {
	public MyBeanFactoryProcessor() {
		System.out.println("MyBeanFactoryProcessor");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor->postProcessBeanFactory");
	}

}
