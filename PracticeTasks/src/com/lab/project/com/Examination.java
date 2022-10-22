package com.lab.project.com;

public class Examination {

	private String exanimationName;
	private int examinationPrice;
	private MedicalTechnologist medicalTechnologists;
	private Pacient pacient;

	public Examination(String exanimationName, int examinationPrice, MedicalTechnologist medicalTechnologists,
			Pacient pacients) {
		this.exanimationName = exanimationName;
		this.examinationPrice = examinationPrice;
		this.medicalTechnologists = medicalTechnologists;
		this.pacient = pacients;
	}

	public String getExanimationName() {
		return exanimationName;
	}

	public void setExanimationName(String exanimationName) {
		this.exanimationName = exanimationName;
	}

	public int getExaminationPrice() {
		return examinationPrice;
	}

	public void setExaminationPrice(int examinationPrice) {
		this.examinationPrice = examinationPrice;
	}

	public MedicalTechnologist getMedicalTechnologists() {
		return medicalTechnologists;
	}

	public void setMedicalTechnologists(MedicalTechnologist medicalTechnologists) {
		this.medicalTechnologists = medicalTechnologists;
	}

	public Pacient getPacient() {
		return pacient;
	}

	public void setPacient(Pacient pacients) {
		this.pacient = pacients;
	}

	public void totalInsurance(Pacient pacient) {
		int total = pacient.getPayment() - getExaminationPrice();
		if (total > 0) {
			System.out.println("Your total amount of insurance after examination is: " + total);
		} else {
			System.out.println("You need to pay additionally: " + total);
		}

	}
	

	@Override
	public String toString() {
		return "Examination [exanimationName=" + exanimationName + ", examinationPrice=" + examinationPrice
				+ ", medicalTechnologists=" + medicalTechnologists + ", pacients=" + pacient + "]";
	}

}
