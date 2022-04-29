import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");

		Person xxx = (Person)ctx.getBean("xxx");
		System.out.println(xxx);
		Person xxx2 = (Person)ctx.getBean("xxx");
		System.out.println(xxx2);
		Person xxx3 = (Person)ctx.getBean("xxx");
		System.out.println(xxx3);
		Person xxx4 = (Person)ctx.getBean("xxx");
		System.out.println(xxx4);
		

	}

}
