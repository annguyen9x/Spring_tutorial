package com.annguyen.model;

public class Reservation {//Reservation: Ä�áº·t phÃ²ng
	private String firstName;
	private String lastName;
	
	public Reservation() {
	}
	
	public Reservation(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
