package de.dhbw.tinf14.functional;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

	public static void main(String[] args)
	{
		final TriFunction<String, Integer, Double, Student> geburt = Student::new;
		final Student klara = geburt.irgendwas("Klara", 17, 132.0D);
		final Student manfred = geburt.irgendwas("Manfred", 42, 180.0D);
		final Student heidi = geburt.irgendwas("Heidi", 32, 100.0D);
		final Student kevin = geburt.irgendwas("Kevin", 30, 70.0D);

		final Main m = new Main();
		final Function<Set<Student>, Kurs> kursbildung =
				Kurs::new;
		final Kurs ti2 = kursbildung.apply(
				new HashSet(Arrays.asList(
						klara,
						manfred,
						heidi,
						kevin)));
		
		final Kurs technischeInformatik = new Kurs(
				Arrays.asList(
						klara,
						manfred,
						heidi,
						kevin));
		
		BiConsumer<Kurs, Consumer<Student>> agePrinting = Kurs::performOnAges;
		agePrinting.accept(ti2, System.out::println);
		ti2.performOnAges(System.out::println);
	}

	private Kurs newKurs(Collection<Student> teilnehmer) {
		return new Kurs(Collections.EMPTY_LIST);
	}
	
	private static void greet(String args) {
		System.out.println("Hello, functional world: " + args);
	}
}
