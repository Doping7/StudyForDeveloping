import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		Student stu = (Student)ctx.getBean("firstStudent");
		Map <String, Cat> c = stu.getMapCat();
		Set<String> keys = c.keySet();
		
		for (String key : keys) {
			System.out.println(c.get(key));
		}

		Properties props = stu.getPhones();
		Set<String> keys2 = props.stringPropertyNames();
		for (String key : keys2) {
			System.out.println(props.get(key));
		}
	}

}
