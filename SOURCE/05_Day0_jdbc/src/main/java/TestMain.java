import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestDAO dao = new TestDAO();
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO dto : list) {
			System.out.println(dto);
		}
	}

}
