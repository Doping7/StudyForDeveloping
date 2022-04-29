import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Animal;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/kkk/person.xml");
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/kkk/animal.xml");
		
		Person p1 = (Person)ctx.getBean("xxx");
		Animal a1 = (Animal)ctx.getBean("yyy");
		
		String str = p1.getInfo();
		String str2 = a1.getName();
		System.out.println(str + "\t" + str2);

	}

}
