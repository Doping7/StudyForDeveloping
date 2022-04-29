import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TestDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	public TestDAO() {
		super();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void insert(int num, String name, String address ){
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into test(num, username, address) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			
			con.setAutoCommit(false);
			
			int n = pstmt.executeUpdate();
			System.out.println(n);
			int x = 5/0;
			if(n == 1) con.commit();
			
		} catch (Exception e) {
			try {
				System.out.println("rollback");
				con.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}finally {
				try {
					if (pstmt != null) pstmt.close();
					if (con != null) {
						con.setAutoCommit(true);
						con.close();
					}
				} catch (Exception e3) {
					e.printStackTrace();
				}
			}
		}
		
	}

	public ArrayList<TestDTO> select(){
		ArrayList<TestDTO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from test";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int n = rs.getInt("num");
				String n2 = rs.getString("username");
				String n3 = rs.getString("address");
				TestDTO dto = new TestDTO(n, n2, n3);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) rs.close();
				if (con != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
		
		
	}
	
}
