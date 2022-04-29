import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Dog;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
//		Cat c = new Cat("나비", 10);
//		Dog d = new Dog("멍멍이", 10);
//		Person p = new Person("홍길동", 20 , c, d);
//		System.out.println(p);

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person xxx = (Person)ctx.getBean("one");
		System.out.println(xxx);
		Cat yyy = xxx.getCat();
		Dog zzz = xxx.getDog();
		System.out.println(yyy + "\t"+ zzz);
	}

}
