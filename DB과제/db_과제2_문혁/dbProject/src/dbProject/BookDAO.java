package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {
	public void insertBook(BookDTO bookDTO) throws ClassNotFoundException, SQLException {
		String sql = "insert into Book values(?,?,?,?,?,?)";
		String url = "jdbc:mysql://localhost:3306/shopdb";
		String driver = "com.mysql.cj.jdbc.Driver";
		String id = "root";
		String pwd = "mcys1309";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pwd);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bookDTO.getBookNo());
		pstmt.setString(2, bookDTO.getBookTitle());
		pstmt.setString(3, bookDTO.getBookAuthor());
		pstmt.setInt(4, bookDTO.getBookYear());
		pstmt.setInt(5, bookDTO.getBookPrice());
		pstmt.setString(6, bookDTO.getBookPublisher());
		int a = pstmt.executeUpdate();
		if (a > 0) {
			System.out.println("삽입 완료");
		} else {
			System.out.println("삽입 실패");
		}
		pstmt.close();
		con.close();
	}

	public void selectBook() throws ClassNotFoundException,SQLException {
		String sql = "select * from book";
		String url = "jdbc:mysql://localhost:3306/shopdb";
		String driver = "com.mysql.cj.jdbc.Driver";
		String id = "root";
		String pwd = "mcys1309";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pwd);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%s %n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
