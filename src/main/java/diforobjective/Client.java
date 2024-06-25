package diforobjective;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student st = context.getBean("std",Student.class);
		st.cheating();
		
		AnotherStudent ast = context.getBean("astudent",AnotherStudent.class);
		ast.cheating();
	}

}
