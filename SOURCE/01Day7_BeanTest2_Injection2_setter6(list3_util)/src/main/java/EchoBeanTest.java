import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.AnotherBean;
import com.spring.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echo = (EchoBean)ctx.getBean("echoBean");
		System.out.println(echo.getValueList());
		System.out.println(echo.getAnotherBean());
		
		List<AnotherBean> list = echo.getValueList();
		for (AnotherBean a : list) {
			System.out.println(a.getName());
		}

		
		
	}
}
