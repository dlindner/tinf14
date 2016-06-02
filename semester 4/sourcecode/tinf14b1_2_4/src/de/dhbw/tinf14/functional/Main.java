package de.dhbw.tinf14.functional;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

	public static void main(final String[] args) {
		
		final ScenarioBuilder factory = new ScenarioBuilder(new Random(132L));
		final Scenario world = factory.build(30);
		
		final List<Student> oldies = world.couses().stream()
					  .map(Kurs::subscriptions)
					  .flatMap(List::stream)
					  .filter(student -> student.getAge() >= 50)
					  .filter(student -> HairColor.none == student.getHair())
					  .filter(student -> EyeColor.green == student.eyeColor())
					  .filter(student -> Sex.male == student.getSex())
					  .collect(Collectors.toList());
		oldies.forEach(student -> System.out.println(student + ", a " + student.getSex() + " with " + student.getHair() + " hair."));
	}
}
