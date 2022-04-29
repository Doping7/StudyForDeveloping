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
	// 외부 파일인 xml파일도 불러오기가 가능하다.
		//spring에서 중요한 것. 객체생성을 컨테이너가 해준다는 것. 그렇기 때문에 
		//객체들은 이미 컨테이너를 생성할때 함께 생성이 되고 그 이후엔 생성되어있는 객체들을 가져와 사용하는 것 뿐.
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("file:\\c:\\upload\\person.xml");
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1);
		Person p2 = (Person)ctx.getBean("xxx");
		String xx = p2.getinfo();
		System.out.println(xx);
	}

}
