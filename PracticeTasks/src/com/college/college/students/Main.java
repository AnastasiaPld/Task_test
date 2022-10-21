package com.college.college.students;

import java.math.BigDecimal;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Major cs = new Major("Computer science", 5.5, 1, BigDecimal.valueOf(400), BigDecimal.valueOf(2500));

		Major automation = new Major("automation", 4, 1, BigDecimal.valueOf(400), BigDecimal.valueOf(2500));

		Major telecomunication = new Major("Telecomunication", 4, 1, BigDecimal.valueOf(400),
				BigDecimal.valueOf(2500));

		List<Major> majors = List.of(cs, automation, telecomunication);

		University university = new University("SU", "Sofia", "Rectora", majors);
		
		Student student = new Student("Rado",18, majors, 2, CitizenShipType.DOMESTIC);
		
		Student student2 = new Student("Ivan",18, majors, 5, CitizenShipType.DOMESTIC);
		
		Student student3 = new Student("Peter",18, majors, 4, CitizenShipType.EU);
		
		Student student7= new Student.Builder("Test",10)
				.setGrade(4.8)
				.setMajorsApplied(majors)
				.build();
		
		cs.apply(student);
		cs.apply(student2);
		cs.apply(student3);
		
		telecomunication.apply(student3);
		telecomunication.apply(student2);
		
		automation.apply(student3);
		
		university.acceptStudents();

	}

}
