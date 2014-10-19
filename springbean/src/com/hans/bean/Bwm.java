package com.hans.bean;

public class Bwm {
	private static Bwm bwm ;
	private Bwm() {
		
	}
	public static Bwm getInstance() {
		if(bwm==null) {
			bwm = new Bwm();
		}
		return bwm;
	}
	
}
