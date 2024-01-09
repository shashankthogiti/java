package com.shashank.learnspringframework.examples.c1;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shashank.learnspringframework.examples.a1.DepInjectionLauncherApplication;

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			context.getBean(BusinessCalculationService.class).findMax();

		}

	}

}
