import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		Person p = (Person)ctx.getBean("onePerson");
		System.out.println(p);
		System.out.println(p.getCat());
		System.out.println(p.getDog());
	}
}
