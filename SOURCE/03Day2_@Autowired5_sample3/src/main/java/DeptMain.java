import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		DeptService service = (DeptService)ctx.getBean("service");
		System.out.println(service);
		/*List<String> list = service.getList();
		for (String s : list) {
			System.out.println(s);*/
		//}
		
	}
}
