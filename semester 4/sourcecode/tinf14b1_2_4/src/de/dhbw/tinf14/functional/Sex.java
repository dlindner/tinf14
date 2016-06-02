package de.dhbw.tinf14.functional;

import java.util.Random;

public enum Sex {

	female,
	male,
	other;
	
	public static Sex randomFor(final Random random) {
		final double percentage = random.nextDouble();
		if (percentage > 0.99D) {
			return Sex.other;
		}
		if (percentage > 0.49D) {
			return Sex.male;
		}
		return Sex.female;
	}
}
