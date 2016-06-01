package de.dhbw.tinf14.functional;

public class Student {
	
	private final String name;
	private final int age;

	public Student(
			String name,
			int age,
			double iq) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return this.name + " aged " + this.age;
	}
}
