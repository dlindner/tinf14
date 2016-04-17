package de.dhbw.tinf14.calisthenics;

public class Year {
	
	private int yearsAD;

	public Year(int yearsAD) {
		super();
		this.yearsAD = yearsAD;
	}
	
	public void increaseIfLeap(Counter counter) {
		if (isLeap()) {
			counter.increase();
		}
	}

	private boolean isLeap() {
		return 0 == this.yearsAD % 4;
	}
}
