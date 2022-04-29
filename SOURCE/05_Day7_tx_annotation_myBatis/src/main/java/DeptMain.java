import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.OrderDTO;
import com.dto.ProductDTO;
import com.service.ProductService;

public class DeptMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/config/product.xml");
		ProductService service = (ProductService)ctx.getBean("service");
		try {
			service.addOrder("p01", 5);
			}catch(Exception e) {
				System.out.println("에러 발생 롤백처리");
			}
		List<ProductDTO> list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
			
			   } 
		 List<OrderDTO> list2 = service.selectOrder(); 
		  for (OrderDTO dto :
			  list2) { 
			   System.out.println(dto); 
			    }
		  
			 }
	}


