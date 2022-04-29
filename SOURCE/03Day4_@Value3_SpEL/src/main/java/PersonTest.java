import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p = (Person)ctx.getBean("yyy");
		System.out.println(p);
		Person p1 = (Person)ctx.getBean("xxx");
		System.out.println(p);
	}
}
