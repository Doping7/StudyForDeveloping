import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
//		DeptDAO d = new DeptDAO();
//		DeptService s = new DeptService(d);
//		System.out.println(s.getList());
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		DeptService s = (DeptService)ctx.getBean("service");
		System.out.println(s.getList());
	}

}
