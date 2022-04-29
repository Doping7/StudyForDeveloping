import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:config.xml");
		TestDAO dao = (TestDAO) ctx.getBean("dao");
		int n = dao.delete(5);
		System.out.println(n);
		int n1 = dao.insert(5, "유재석", "서울");
		System.out.println(n1);
		int n2 = dao.update(5, "유재석", "제주");
		System.out.println(n2);
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO testDTO : list) {
			System.out.println(testDTO);
		}

		
	}

}
