package com.hans.service;

import org.springframework.stereotype.Service;

import com.hans.model.Info;

@Service
public class InfoService {
	
	public void add(Info info) {
		System.out.println(info.getId() + "   " + info.getName());
	}
}
