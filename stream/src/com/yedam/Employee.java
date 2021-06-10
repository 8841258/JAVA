package com.yedam;

public class Employee {
	private String firstDame;
	private String title;
	private String birthDate;
	
	
	public String getFirstDame() {
		return firstDame;
	}
	public void setFirstDame(String firstDame) {
		this.firstDame = firstDame;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Employee [firstDame=" + firstDame + ", title=" + title + "]";
	}
	
	
	
}
