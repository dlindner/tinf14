package de.dhbw.tinf14.functional;

public class Student {
	
	private final String name;
	private final int age;
	private final double iq;
	private final HairColor hair;
	private final EyeColor eyes;
	private final Sex sex;

	public Student(
			final String name,
			final int age,
			final double iq,
			final HairColor hair,
			final EyeColor eyes,
			final Sex sex) {
		super();
		this.name = name;
		this.age = age;
		this.iq = iq;
		this.hair = hair;
		this.eyes = eyes;
		this.sex = sex;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double iq() {
		return this.iq;
	}
	
	public HairColor getHair() {
		return this.hair;
	}
	
	public EyeColor eyeColor() {
		return this.eyes;
	}
	
	public Sex getSex() {
		return this.sex;
	}
	
	@Override
	public String toString() {
		return this.name + " aged " + this.age;
	}
}
