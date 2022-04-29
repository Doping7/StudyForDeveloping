import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
//		Cat c = new Cat("나비", 10);
//		Person p = new Person("홍길동", 20, c);
//		System.out.println(p);

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person xxx = (Person)ctx.getBean("xxx");
		System.out.println(xxx);
		Cat yyy = xxx.getCat();
		System.out.println(yyy);
	}

}
