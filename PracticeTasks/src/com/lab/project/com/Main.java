package com.lab.project.com;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		

		Pacient pacient1 = new Pacient("Ivan Ivanov", 50);
		Pacient pacient2 = new Pacient("Petar Petrov", 60);
		Pacient pacient3 = new Pacient("Lina Lolava", 70);
		Pacient pacient4 = new Pacient("Vova Petrov", 80);
		
		List<Pacient> pacients = new ArrayList<>();
		pacients.add(pacient1);
		pacients.add(pacient2);
		pacients.add(pacient3);

		MedicalTechnologist laborant1 = new MedicalTechnologist("Laborant 1");
		MedicalTechnologist laborant2 = new MedicalTechnologist("Laborant 2");
		MedicalTechnologist laborant3 = new MedicalTechnologist("Laborant 3");
		MedicalTechnologist laborant4 = new MedicalTechnologist("Laborant 4");
		MedicalTechnologist laborant5 = new MedicalTechnologist("Laborant 5");
		
		List<MedicalTechnologist> laborants = new ArrayList<>();
		laborants.add(laborant1);
		laborants.add(laborant2);
		laborants.add(laborant3);
		

		Examination exam1 = new Examination("Blood tests", 5, laborant1, pacient1);
		Examination exam2 = new Examination("Blood tests", 10, laborant2, pacient2);
		Examination exam3 = new Examination("Blood tests", 80, laborant3, pacient3);
		Examination exam4 = new Examination("Blood tests", 50, laborant4, pacient4);
		
		List<Examination> examinations = new ArrayList<>();
		examinations.add(exam1);
		examinations.add(exam2);
		examinations.add(exam3);


		// Creation of a Lab
		Lab lab = new Lab("Sofia Central Lab", examinations, pacients, laborants);
		
		lab.sumOfExamination(examinations); 
		System.out.println("-----------------------");
		lab.pacientData(); 
		System.out.println("-----------------------");
		lab.laborantData();
		System.out.println("-----------------------");
		lab.totalLaborants(laborants);
		System.out.println("-----------------------");
		lab.addMedicalTechnologist(laborant5, laborants);
		System.out.println("-----------------------");
		lab.totalLaborants(laborants);
		System.out.println("-----------------------");
		exam3.totalInsurance(pacient3);
		System.out.println("-----------------------");
		lab.addPacient(pacient4, pacients);
		System.out.println("-----------------------");
		lab.getPacientsLaborant();

		
	
		Thread thr1 = new Threads(exam1, exam2);
		Thread thr2 = new Threads(exam3, exam4);
		thr1.start();
		thr1.getState();
		try {
			thr1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thr2.start();

		try {
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	}

