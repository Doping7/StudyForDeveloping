

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		EchoBean echo = (EchoBean)ctx.getBean("echoBean");
		System.out.println(echo.getAnotherBean());
		System.out.println(echo.getValueList());
		echo.getAnotherBean().getInfo();
	
		
		
	}
}
