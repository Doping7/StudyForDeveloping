package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dto.TestDTO;

public class TestDAO {

	@Autowired
	DataSource dataSource;

	// 드라이버 로딩, connection 연결 후 연결 되어있는 커넥션들을 받아서 사용하게 된다.
	public TestDAO() {

	}

	public ArrayList<TestDTO> select() {
		// System.out.println(dataSource);
		ArrayList<TestDTO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
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
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;

	}

	// DML을 하면서 알수 있는 것 dbcp2는 auto commit이다.
	public int delete(int i) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = dataSource.getConnection();
			String sql = "delete from test where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return n;

	}

	public int insert(int num, String name, String address) {
		int n =0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = dataSource.getConnection();// 수정됨
			String sql = "insert into test (num, username,address) " + " values ( ? , ? , ? )";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			// insert, delete, update 은 executeUpdate()
			n = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return n;
	}// end insert

	// num에 해당하는 레코드 수정
			public int update(int num, String name, String address){
				 Connection con = null;
				  PreparedStatement pstmt = null;
				  int n = 0;
				  
				  try{
				  con = 
						  dataSource.getConnection();// 수정됨
		String sql ="update test set username =?, address= ? where num = ?" ;
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(3, num);
				pstmt.setString(1, name);
				pstmt.setString(2, address);
			  //insert, delete, update 은 executeUpdate()	
				n = pstmt.executeUpdate();
			 
				  }catch(Exception e){
					  e.printStackTrace();
				  }finally{
					  try {
						if(pstmt!=null)pstmt.close();
						if(con!=null)con.close();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }
				
				return n;
				
			}

}
