package com.hans.bean2;

public class Benz implements Car {
	private int price;
	private Engine engine;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void run() {
		System.out.println(this + "  " + price + " " + engine);

	}
}
