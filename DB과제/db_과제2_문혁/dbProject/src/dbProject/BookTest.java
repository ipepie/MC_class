package dbProject;

import java.sql.SQLException;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] bookInfo = sc.nextLine().split(" ");
		//input : "B004 자바스크립트 강길동 2020 28000 서울출판사";
//		BookDTO dto = new BookDTO();
//		dto.setBookNo(bookInfo[0]);
//		dto.setBookTitle(bookInfo[1]);
//		dto.setBookAuthor(bookInfo[2]);
//		dto.setBookYear(Integer.parseInt(bookInfo[3]));
//		dto.setBookPrice(Integer.parseInt(bookInfo[4]));
//		dto.setBookPublisher(bookInfo[5]);
		BookDTO dto = new BookDTO(bookInfo[0],bookInfo[1],bookInfo[2],Integer.parseInt(bookInfo[3]),Integer.parseInt(bookInfo[4]),bookInfo[5]);
		BookDAO dao = new BookDAO();
		try {
			dao.insertBook(dto);
			dao.selectBook();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
