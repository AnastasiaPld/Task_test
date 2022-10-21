package com.college.college.students;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Major {
	private String name;

	private double minimalGrade;

	private int quota;

	private BigDecimal priceForDomestic;
	private BigDecimal priceForInternational;
	
	private List<Student> studentsApplicants;

	public Major(String name, double minimalGrade, int quota, BigDecimal priceForDomestic,
			BigDecimal priceForInternational) {
		
		this.name = name;
		this.minimalGrade = minimalGrade;
		this.quota = quota;
		this.priceForDomestic = priceForDomestic;
		this.priceForInternational = priceForInternational;
		studentsApplicants= new ArrayList();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMinimalGrade() {
		return minimalGrade;
	}

	public void setMinimalGrade(double minimalGrade) {
		this.minimalGrade = minimalGrade;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public BigDecimal getPriceForDomestic() {
		return priceForDomestic;
	}

	public void setPriceForDomestic(BigDecimal priceForDomestic) {
		this.priceForDomestic = priceForDomestic;
	}

	public BigDecimal getPriceForInternational() {
		return priceForInternational;
	}

	public void setPriceForInternational(BigDecimal priceForInternational) {
		this.priceForInternational = priceForInternational;
	}

	
	public List<Student> getStudentsApplicants() {
		return studentsApplicants;
	}

	public void setStudentsApplicants(List<Student> studentsApplicants) {
		this.studentsApplicants = studentsApplicants;
	}

	public void apply(Student applicant) {
		
		studentsApplicants.add(applicant);
		
	}
	@Override
	public String toString() {
		return "Major [name=" + name + ", minimalGrade=" + minimalGrade + ", quota=" + quota + ", priceForDomestic="
				+ priceForDomestic + ", priceForInternational=" + priceForInternational + "]";
	}

}
