package com.practiceonECM;

public class Student {
/*
 * 1. Create a class Student with private variables id and name.
Provide getters and setters. Write a program to set values and print them.**
 */

	private int id;
	private String name;
	
	
	public int setId(int id) {
		return this.id=id;
	}
	public String setName(String name) {
		return this.name=name;
	}
	
	public int getId() {
		return id;
		
	}
	
	public String getName() {
		return name;
	}
	
}
