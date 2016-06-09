package de.dhbw.tinf14.functional;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Main {

	public static void main(final String[] args) {
		
		final ScenarioBuilder factory = new ScenarioBuilder(new Random(132L));
		final Scenario world = factory.build(90);
		
		final long start = System.nanoTime();
		final OptionalDouble averageAge = world.courses().stream()
					  .parallel()
					  .map(Kurs::subscriptions)
					  .flatMap(List::stream)
					  .filter(student -> student.getAge() >= 50)
					  .filter(student -> HairColor.none == student.getHair())
					  .filter(student -> EyeColor.green == student.eyeColor())
					  .filter(student -> Sex.other == student.getSex())
					  .distinct()
					  .mapToInt(Student::getAge)
					  .average();
		averageAge.ifPresent(System.out::println);
//					  .collect(Collectors.toList());
		final long end = System.nanoTime();
		System.out.println(" in " + (end - start) / 1E9 + " s");
		//oldies.forEach(student -> System.out.println(student + ", a " + student.getSex() + " with " + student.getHair() + " hair."));
	//	System.out.println(oldies.size() + " in " + (end - start) / 1E9 + " s");
	Error
	}
}
