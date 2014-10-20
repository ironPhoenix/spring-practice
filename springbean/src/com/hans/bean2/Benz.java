package com.hans.bean2;

import org.springframework.beans.factory.annotation.Autowired;

public class Benz implements Car {
	private int price;
	private Engine engine;
	private Audi audi;
	
	
	public Audi getAudi() {
		return audi;
	}

	public void setAudi(Audi audi) {
		this.audi = audi;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}
	
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void run() {
		System.out.println(this + "  " + price + " " + engine+ " " + audi);

	}
}
