package com.shashank.learnspringframework.examples.g1;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component // we can replace @Named for the @Component
class BusinessService {
	private DataService dataService;

	public DataService getDataService() {
		System.out.println("Setter Injection");
		return dataService;
	}

	@Autowired // we can replace @Inject for the @Component
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

}

@Component
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(BusinessService.class).getDataService());

		}

	}

}
