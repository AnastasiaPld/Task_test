package com.college.college.students;

import java.util.List;

public class Student {

	private String name;
	private int age;
	private List<Major> majorsApplied;
	private double grade;

	private CitizenShipType citizenshipType;

	public Student(String name, int age, List<Major> majorsApplied, double grade, CitizenShipType citizenshipType) {
		super();
		this.name = name;
		this.age = age;
		this.majorsApplied = majorsApplied;
		this.grade = grade;
		this.citizenshipType = citizenshipType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Major> getMajorsApplied() {
		return majorsApplied;
	}

	public void setMajorsApplied(List<Major> majorsApplied) {
		this.majorsApplied = majorsApplied;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public CitizenShipType getCitizenshipType() {
		return citizenshipType;
	}

	public void setCitizenshipType(CitizenShipType citizenshipType) {
		this.citizenshipType = citizenshipType;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", majorsApplied=" + majorsApplied + ", grade=" + grade
				+ ", citizenshipType=" + citizenshipType + "]";
	}

	public static class Builder {

		private String name;
		private int age;
		private List<Major> majorsApplied;
		private double grade;

		private CitizenShipType citizenshipType;

		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setMajorsApplied(List<Major> majorsApplied) {
			this.majorsApplied = majorsApplied;
			return this;
		}

		public Builder setGrade(double grade) {
			this.grade = grade;
			return this;
		}

		public void setCitizenshipType(CitizenShipType citizenshipType) {
			this.citizenshipType = citizenshipType;
		}

		public Student build() {
			return new Student(name, age, majorsApplied, grade, citizenshipType);
		}

	}

}
