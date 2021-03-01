package com.zeke.recapitulare2.autor;

public class Author {
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) {
		// TODO Auto-generated constructor stub
		this.email = email;
		this.name = name;
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {

		return this.name + "(" + this.gender + ")" +" at " + this.email;
	}
}
