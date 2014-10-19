package com.hans.bean;

public class Audi {
	private int price;

	public Audi() {
		price = (int)(Math.random() * 100);
	}

	public String toString() {
		return super.toString() + "  " + price;
	}
}
