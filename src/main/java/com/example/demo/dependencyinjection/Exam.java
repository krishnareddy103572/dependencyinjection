package com.example.demo.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
//		Student st = new Student();
//		st.setStname("Krishna Karapureddy");
//		st.displayInfo();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu = context.getBean("student",Student.class);
		stu.displayInfo();
		
		StudentExamplebyCI studentExamplebyCI = context.getBean("studentbyci",StudentExamplebyCI.class);
		studentExamplebyCI.displayInfo();
	}


}
