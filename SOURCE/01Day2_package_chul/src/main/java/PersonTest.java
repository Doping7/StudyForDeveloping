import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		//1. 기존 방법 : 객체의 직접 호출 및 생성
		Person p = new Person();
		String m = p.getinfo();
		System.out.println(m);

		//src/main/resources폴더및 person.xml <bean id="xxx" class="com.spring.Person"> </bean>
				//마우스오른쪽  spring bean configuration.xml

		System.out.println("================================================");
	
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		Person p2 = (Person)ctx.getBean("xxx");
		String xx = p2.getinfo();
		
	}

}
