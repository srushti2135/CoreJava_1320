package Encapsulation;

public class Person {
	
	/*
	 * 1. Create a class with private variables
	 

	Question:
	Create a class Person with private variables name and age.
	Add setter and getter methods.
	Create an object and print the name and age.
	
	*/
	
	private String name;
	private int age;
	
	
	public void setName(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public void getAge() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

}
