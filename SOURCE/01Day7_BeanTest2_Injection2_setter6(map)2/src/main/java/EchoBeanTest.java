import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.AnotherBean;
import com.spring.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo2.xml");
		EchoBean echo = (EchoBean)ctx.getBean("echoBean");
		System.out.println(echo.getMap());
				
		Map <String, AnotherBean> map = echo.getMap();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}

		
		
	}
}
