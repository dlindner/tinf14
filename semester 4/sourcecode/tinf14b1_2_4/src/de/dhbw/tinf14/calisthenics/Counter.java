package de.dhbw.tinf14.calisthenics;

public class Counter {

	private int count;
	
	public Counter() {
		super();
		this.count = 0;
	}

	public void increase() {
		this.count++;
	}
	
	public void describe() {
		System.out.println(this.count);
	}
}
