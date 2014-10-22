package com.hans.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hans.model.Info;
import com.hans.service.InfoService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("a.xml");
		InfoService is = (InfoService)context.getBean("infoService");
		Info i = new Info();
		i.setId(12);
		i.setName("aa");
		is.add(i);
	}
}
