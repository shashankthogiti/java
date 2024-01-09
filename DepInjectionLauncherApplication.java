package com.shashank.learnspringframework.examples.a1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

	@Autowired
	Dependency1 depencency1;

	@Autowired
	Dependency2 depencency2;

	// @Autowired
	// in construction @Autowired is not compulsary
	// Spring teamrecomend constructor based injection
	public YourBusinessClass(Dependency1 depencency1, Dependency2 depencency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.depencency1 = depencency1;
		this.depencency2 = depencency2;
	}

	/*
	 * @Autowired public void setDepencency1(Dependency1 depencency1) {
	 * System.out.println("Setter Injection - setDependency1 "); this.depencency1 =
	 * depencency1; }
	 * 
	 * @Autowired public void setDepencency2(Dependency2 depencency2) {
	 * System.out.println("Setter Injection - setDependency2 "); this.depencency2 =
	 * depencency2; }
	 * 
	 */
	@Override
	public String toString() {
		return "Using" + depencency1 + "and" + depencency2;
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			context.getBean(YourBusinessClass.class);

		}

	}

}
