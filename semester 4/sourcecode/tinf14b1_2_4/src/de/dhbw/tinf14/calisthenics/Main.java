package de.dhbw.tinf14.calisthenics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Year> years = Arrays.asList(
				new Year(2010),
				new Year(2011),
				new Year(2012),
				new Year(2013),
				new Year(2014),
				new Year(2015),
				new Year(2016));
		
		final Counter leapYears = new Counter();
		for (Year each : years) {
			each.increaseIfLeap(leapYears);
		}
		leapYears.describe();
	}
}
