package com.lab.project.com;

import java.util.Comparator;
import java.util.List;

import com.college.college.students.Student;

public class Lab {

	private String labName;
	private List<Examination> tests;
	private List<Pacient> pacient;
	private List<MedicalTechnologist> medicalTechnologist;

	public Lab(String labName, List<Examination> tests, List<Pacient> pacient,
			List<MedicalTechnologist> medicalTechnologist) {
		this.labName = labName;
		this.tests = tests;
		this.pacient = pacient;
		this.medicalTechnologist = medicalTechnologist;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public List<Examination> getTests() {
		return tests;
	}

	public void setTests(List<Examination> tests) {
		this.tests = tests;
	}

	public List<Pacient> getPacient() {
		return pacient;
	}

	public void setPacient(List<Pacient> pacient) {
		this.pacient = pacient;
	}

	public List<MedicalTechnologist> getMedicalTechnologist() {
		return medicalTechnologist;
	}

	public void setMedicalTechnologist(List<MedicalTechnologist> medicalTechnologist) {
		this.medicalTechnologist = medicalTechnologist;
	}

	@Override
	public String toString() {
		return "Lab [labName=" + labName + ", tests=" + tests + ", pacient=" + pacient + ", medicalTechnologist="
				+ medicalTechnologist + "]";
	}

	public List<MedicalTechnologist> addMedicalTechnologist(MedicalTechnologist laborant,
			List<MedicalTechnologist> list) {
		list.add(laborant);
		return list;
	}

	public void getPacientsLaborant() {
		for (Examination exam : tests) {
			System.out.printf("All records for Laborant %s that is proceed with analyses of a pacient %s \n", exam.getPacient().getName(), exam.getMedicalTechnologists().getName() );
		}
	}
	
	public List<MedicalTechnologist> removeMedicalTechnologist(MedicalTechnologist laborant,
			List<MedicalTechnologist> list) {
		list.remove(laborant);
		return list;
	}

	public List<Pacient> addPacient(Pacient pacient, List<Pacient> list) {
		list.add(pacient);
		return list;
	}

	public List<Pacient> removePacient(Pacient pacient, List<Pacient> list) {
		list.remove(pacient);
		return list;
	}

	public void sumOfExamination(List<Examination> examinations) {
		int sum = 0;
		for (Examination examination : examinations) {

			sum += examination.getExaminationPrice();
			
		}
		System.out.println("Total sum for all examination in the Lab:"+ sum);
		

	}

	public void pacientData() {

		for (Examination test : tests) {

			System.out.println("Pacient name:" + test.getPacient().getName() + " Laborant name:"
					+ test.getMedicalTechnologists().getName() + " Examination is:" + test.getExanimationName());
		}

	}

	public void laborantData() {

		for (MedicalTechnologist med : medicalTechnologist) {

			System.out.println(" Laborant name:"
					+ med.getName());
		}

	}
	
	
	public int totalPacient(List<Pacient> pacients) {
		int size = pacients.size();

		return size;

	}

	public int totalExaminations(List<Examination> examinations) {
		int size = examinations.size();

		return size;

	}

	public void totalLaborants(List<MedicalTechnologist> laborants) {
		int size = laborants.size();

		System.out.println("Lobarants in the Lab are:" + size);

	}
}
