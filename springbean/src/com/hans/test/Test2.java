package com.hans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hans.bean2.Car;
import com.hans.bean2.Saler;

public class Test2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
/*		ApplicationContext context = new ClassPathXmlApplicationContext("3.xml");
		Car car = (Car) context.getBean("benz");
		car.run();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("2.xml");
		Saler s = (Saler) context.getBean("saler");
		for(Car c:s.getCars()) {
			c.run();
		}
	}
}
