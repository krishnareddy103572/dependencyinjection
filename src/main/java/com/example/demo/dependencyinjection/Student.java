package com.example.demo.dependencyinjection;

public class Student {
	String stname;
	int id;
	
	
	
	public void setId(int id) {
		this.id = id;
	}



	public void setStname(String stname) {
		this.stname = stname;
	}



	public void displayInfo() {
		System.out.println("Setter Injection values::");
		System.out.println("Student name is: "+stname +"  id is :"+id);
	}

}
