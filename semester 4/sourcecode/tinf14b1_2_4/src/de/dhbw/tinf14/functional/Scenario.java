package de.dhbw.tinf14.functional;

import java.util.List;

public class Scenario {
	
	private List<Kurs> courses;

	public Scenario() {
		super();
	}

	public void courses(final List<Kurs> courses) {
		this.courses = courses;
	}
	
	public List<Kurs> courses() {
		return this.courses;
	}
}
