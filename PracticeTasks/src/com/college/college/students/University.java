package com.college.college.students;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class University {

	private String name;
	private String city;
	private String address;
	private List<Major> major;

	public University(String name, String city, String address, List<Major> major) {
		this.name = name;
		this.city = city;
		this.address = address;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Major> getMajor() {
		return major;
	}

	public void setMajor(List<Major> major) {
		this.major = major;
	}

	public void acceptStudents() {

		for (Major majors : major) {

		 majors.getStudentsApplicants().stream()
					.sorted(Comparator.comparingDouble(Student::getGrade).reversed())
					.filter(t -> t.getGrade() >= majors.getMinimalGrade()).limit(majors.getQuota())
					.forEach(t ->System.out.printf("Accept student %s in %s\n", t.getName(), t.getGrade()) );
					
			
			for (Student studentApplicant : majors.getStudentsApplicants()) {
				if (studentApplicant.getGrade() >= majors.getMinimalGrade()) {
					System.out.printf("Accept student %s in %s\n", studentApplicant.getName(), majors.getName());
				}
			}
		}
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", city=" + city + ", address=" + address + ", major=" + major + "]";
	}

}
