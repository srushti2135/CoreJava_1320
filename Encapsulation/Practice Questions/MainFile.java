package com.practiceonECM;

import Encapsulation.CubeSquare;

public class MainFile {
	
	/*
	public static void main(String args[]) {
		
	
	Student s =new Student();
	s.setId(123);
	s.setName("Srushti");
	System.out.println(s.getId());
	System.out.println(s.getName());

}
*/
	
	public static void main(String args[]) {
		
		CubeSquare cs = new CubeSquare();
		cs.setCube(12);
		cs.setSquare(12);
		cs.getCube();
		cs.getSquare();
	}
	}
