package com.hans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hans.bean.Benz;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("a.xml");
/*		Benz benz = (Benz) context.getBean("benz");
		System.out.println(benz.show());*/
/*		Bwm bwm = (Bwm) context.getBean("bwm");
		System.out.println(bwm);*/
/*		System.out.println((Audi) context.getBean("audi"));
		System.out.println((Audi) context.getBean("audi"));
		System.out.println((Audi) context.getBean("audi"));
		System.out.println((Audi) context.getBean("audi"));*/
		
	}
}
