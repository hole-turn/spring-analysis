package com.xlh.spring.demo.processor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xielinhao
 * @title: ProcessConfig
 * @projectName: spring
 * @description:
 * @date: 10:03 2022/11/23
 */
@Configuration
@ComponentScan("com.xlh.spring.demo.processor")
public class ProcessConfig {
	public ProcessConfig() {
		System.out.println("ProcessConfig init");
	}
}
