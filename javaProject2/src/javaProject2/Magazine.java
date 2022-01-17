package javaProject2;

public class Magazine extends Book {
	int month;
	
	Magazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t   "+month;
	}
}
