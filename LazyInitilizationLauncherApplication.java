package com.shashank.learnspringframework.examples.d1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Some Initilization Logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do something");

	}
}

@Configuration
@ComponentScan
public class LazyInitilizationLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyInitilizationLauncherApplication.class)) {

			System.out.println("Initilization of context is completed");

			context.getBean(ClassB.class).doSomething();

		}

	}

}
