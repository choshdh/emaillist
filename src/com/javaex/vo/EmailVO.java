package com.javaex.vo;

public class EmailVO {

	private int num;
	private String lastName;
	private String firstName;
	private String email;
	
	public EmailVO() {
		// TODO Auto-generated constructor stub
	}

	public EmailVO(int num, String lastName, String firstName, String email) {
		super();
		this.num = num;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmailVO [num=" + num + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email + "]";
	}


	
	
}
