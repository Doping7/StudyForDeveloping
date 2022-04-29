import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person xxx = ctx.getBean("xxx",Person.class);
		System.out.println(xxx.getName());
		Person test = (Person)ctx.getBean("test");
		System.out.println(test.getName());
		

	}

}
