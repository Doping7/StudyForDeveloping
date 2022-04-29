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
		  int count= dao.selectCount();
			System.out.println(count);
			dao.insert(6, "고길동", "강남");
			List<TestDTO> list = dao.select();
			 for (TestDTO dto : list) {
				System.out.println(dto);
			}//end for
	}

}
