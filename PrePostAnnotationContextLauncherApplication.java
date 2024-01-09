package com.shashank.learnspringframework.examples.f1;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class someClass {
	private someDependency someDependency;
	
	public someClass(someDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependency are ready!");
	}

	@PostConstruct
	public void initilize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
}


@Component
class someDependency {

	public void getReady() {
		System.out.println("Some logic using someDependency");
	}

}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
