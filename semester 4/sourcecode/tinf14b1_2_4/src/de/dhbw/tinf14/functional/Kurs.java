package de.dhbw.tinf14.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Kurs {
	
	private final int identifier;
	private final List<Student> teilnehmer;
	
	public Kurs(final int identifier) {
		super();
		this.identifier = identifier;
		this.teilnehmer = new ArrayList<Student>();
	}
	
	public void subscribe(final Student student) {
		this.teilnehmer.add(student);
	}
	
	public List<Student> subscriptions() {
		return this.teilnehmer;
	}
	
	public void performOnAges(final Consumer<Student> action) {
		this.teilnehmer.forEach(action);
	}
	
	@Override
	public String toString() {
		return "Kurs " + this.identifier;
	}
}
