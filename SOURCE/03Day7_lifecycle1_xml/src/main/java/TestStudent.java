import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		Student stu = ctx.getBean(Student.class);
		stu.getInfo();
		ctx.close();
	}

}
