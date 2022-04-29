import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/config/dept.xml");
		DeptService service = (DeptService)ctx.getBean("service");
		DeptDTO xx = new DeptDTO(99, "영업", "제주");
		
		int n = service.add(xx);
		System.out.println("add : " + n);
		
		int n3 = service.update(new DeptDTO(99,"aa","aa"));
		System.out.println("update : " + n3);
		
		int n2 = service.delete(99);
		System.out.println("delete : "+ n2);
		
		List<DeptDTO> list = service.select();
		for (DeptDTO dto : list) {
			System.out.println(dto);
		}
		
	}

}
