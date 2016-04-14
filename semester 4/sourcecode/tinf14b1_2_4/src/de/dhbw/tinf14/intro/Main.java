package de.dhbw.tinf14.intro;

import java.util.LinkedList;
import java.util.List;

public final class Main {

	private Main() {
		super();
	}

	public static void main(final String[] args) {
		final Pony rainbowDash = new Pony("rainbowDash");
		final Schmetterling horst = new Schmetterling();

		final List<Tier> zoo = new LinkedList<>();
		zoo.add(rainbowDash);
		zoo.add(horst);

		rainbowDash.‰uﬂereMeinung();
		horst.‰uﬂereMeinung();
		for (final Tier each : zoo) {
			each.‰uﬂereMeinung();
		}

		final Schlachthof happyPlace = new Schlachthof();
		happyPlace.liefereAb(rainbowDash);
		happyPlace.liefereAb(horst);
		for (final Tier each : zoo) {
			happyPlace.liefereAb(each);
		}


	}

}
