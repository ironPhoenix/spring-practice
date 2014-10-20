package com.hans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hans.bean2.Car;

public class Test4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("4.xml");
		Car car = (Car)context.getBean("benz");
		car.run();
	}
}
