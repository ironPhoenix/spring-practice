package com.hans.bean;

public class Benz {
	private Engine engine;
	private int price;

	public Benz() {
		
	}

	public Benz(Engine engine, int price) {
		this.engine = engine;
		this.price = price;
	}

	public String show() {
		System.out.println("a");
		return engine + "   " + price;
	}
}
