import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/Student.xml");
		Student stu1 = (Student) ctx.getBean("stu");
		Student stu2 = (Student) ctx.getBean("stu");
		System.out.println(stu1 == stu2);// true (singleton) false (prototype)
		//Student stu3 = (Student) ctx.getBean("stu2");
		//System.out.println(stu1 == stu3); //false
	}

}
