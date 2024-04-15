package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
//		Launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfirguration.class);

//		Configure the thing that we want spring to manage.
//		HelloWorldConfiguration class - @Congfiguration
//		name - @Bean

//		Retrieve beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameter"));
		System.out.println(context.getBean("address2"));
//		System.out.println(context.getBean(Address.class));
	}
}