package com.hans.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import com.hans.model.Info;

@Component
public class ParamTest {
	public void testParam(Info info) {
		System.out.println("wqe");
	}
	public void testParamTime(ProceedingJoinPoint joinpoint) {
		long start = System.currentTimeMillis();
		try {
			joinpoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}
}
