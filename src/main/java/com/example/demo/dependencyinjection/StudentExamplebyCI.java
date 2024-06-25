package com.example.demo.dependencyinjection;

public class StudentExamplebyCI {
	String stname;
	int id;
	
	public StudentExamplebyCI(String stname, int id) {
		this.stname = stname;
		this.id = id;
	}

	public void displayInfo() {
		System.out.println("Constructor Injection values::");

		System.out.println("Student name is: "+stname +"  id is :"+id);
	}

}
