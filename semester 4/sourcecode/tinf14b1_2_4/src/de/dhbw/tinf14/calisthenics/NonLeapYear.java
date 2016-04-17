package de.dhbw.tinf14.calisthenics;

public class NonLeapYear extends YearlyAnomalie {
	
	public NonLeapYear() {
		super();
	}

	public void describe() {
		System.out.println("KEIN Schaltjahr!");
	}
}
