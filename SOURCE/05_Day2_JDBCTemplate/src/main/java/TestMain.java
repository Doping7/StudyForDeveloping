import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {
		//DataSourc만을 이용한 db접속 
		  GenericXmlApplicationContext ctx= new
		  GenericXmlApplicationContext("classpath:com/config/config.xml"); 
		  TestDAO	 dao=ctx.getBean("dao", TestDAO.class); 
		  ArrayList<TestDTO> list= (ArrayList<TestDTO>) dao.select();
		  for (TestDTO s : list) { System.out.println(s); }
		  System.out.println("===================");
		  List<TestDTO> list2= dao.selectByName("홍길동");
		  
		  for (TestDTO s : list2) { System.out.println(s); }
	}

}
