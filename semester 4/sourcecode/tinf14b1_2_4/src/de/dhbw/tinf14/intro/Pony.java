package de.dhbw.tinf14.intro;

public class Pony extends Tier {

	private final String name;

	public Pony(String name) {
		super();
		this.name = name;
	}

	@Override
	public void ‰uﬂereMeinung() {
		System.out.println(this.name + ": ich mag gras!");
	}

}
