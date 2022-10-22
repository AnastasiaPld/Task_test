package com.lab.project.com;

public class Pacient {
	
	private String name;
	private int payment;
	
	
	public Pacient(String name, int payment) {
		this.name = name;
		this.payment = payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Pacient [name=" + name + ", payment=" + payment + "]";
	}

}
