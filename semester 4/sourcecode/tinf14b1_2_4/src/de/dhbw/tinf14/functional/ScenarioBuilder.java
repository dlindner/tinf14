package de.dhbw.tinf14.functional;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ScenarioBuilder {
	
	private final Random random;

	public ScenarioBuilder(final Random random) {
		super();
		this.random = random;
	}
	
	public Scenario build(final int size) {
		final Scenario result = new Scenario();
		result.courses(IntStream.range(0, size).mapToObj(Kurs::new).collect(Collectors.toList()));
		System.out.println("Created " + result.couses().size() + " courses.");
		
		final List<Student> allStudents = IntStream.rangeClosed(0, size * 30)
				 .mapToObj(index -> new Student(
						 "Student " + index,
						 this.random.nextInt(100),
						 this.random.nextDouble(),
						 HairColor.values()[this.random.nextInt(HairColor.values().length)],
						 EyeColor.values()[this.random.nextInt(EyeColor.values().length)],
						 Sex.randomFor(this.random)))
			     .collect(Collectors.toList());
		System.out.println("Created " + allStudents.size() + " students.");
		
		allStudents.forEach(student -> subscribeTo(student, result.couses()));
		System.out.println("Subscribed " + allStudents.size() + " students to their courses.");
		
		return result;
	}
	
	private void subscribeTo(final Student student, final List<Kurs> allCourses) {
		final int courseCount = this.random.nextInt(10);
		for (int i = 0; i < courseCount; i++) {
			final int courseIndex = this.random.nextInt(allCourses.size());
			final Kurs subscription = allCourses.get(courseIndex);
			subscription.subscribe(student);
		}
	}
}
