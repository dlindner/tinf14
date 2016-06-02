package de.dhbw.tinf14.functional.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Kurs {
	
	private final List<Student> teilnehmer;
	
	public Kurs(Collection<Student> students) {
		super();
		this.teilnehmer = new ArrayList<Student>(students);
		System.out.println("collection");
	}
	
	public Kurs(Set<Student> students) {
		super();
		this.teilnehmer = new ArrayList<Student>(students);
		System.out.println("set");
	}
	
	public void performOnAges(Consumer<Student> action) {
		this.teilnehmer.forEach(action);
//		this.teilnehmer.forEach(System.out::println);
	}
	
	

}
