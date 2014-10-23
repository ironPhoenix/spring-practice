package com.hans.control;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hans.model.Info;
import com.hans.service.InfoService;

public class InfoControl {
	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("a.xml");
		InfoService infoService = (InfoService)context.getBean("infoService");
		Info info = new Info();
		info.setName("a");
		info.setMessage("a");
		//infoService.add(info);
		for(Info l:infoService.getAll()) {
			System.out.println(l.getName());
		}
	}
}
