package ex12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t[회원 검색 프로그램]");
		System.out.print("이름 검색어 입력 : ");
		String input = scan.next();
		
		String sql = "SELECT MID, NAME, AGE FROM MEMBER WHERE NAME LIKE " + "'%" + input + "%'";
		//String sql2 = "SELECT PWD = '122' FROM MEMBER";
		
		//드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		String id;
		String name;
		String age;
		
		//rs.next();
		
		
		System.out.println("\t아이디  \t이  름  \t나  이");
		
		while(rs.next()) {
			id = rs.getString("MID");
			name = rs.getString("NAME");
			age = rs.getString("AGE");
			System.out.printf("%13s  %13s  %13s\n", id, name, age);
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		/*if(!con.isClosed())
			System.out.println("connected");*/
	}

}
