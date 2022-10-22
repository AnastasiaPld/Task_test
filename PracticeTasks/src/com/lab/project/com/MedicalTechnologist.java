package com.lab.project.com;

public class MedicalTechnologist {

	String name;

	public MedicalTechnologist(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MedicalTechnologist [name=" + name + "]";
	}

}
