package submit_0314.submit03;

import java.util.ArrayList;

public class Library {
	private Library() {
		
	}
	private static Library instance = new Library();
	
	public static Library getInstance() {
		return instance;
	}
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void showList() {
		for(Book book : bookList) {
			System.out.println(book);
		}
	}
	
	public void addBook() {
		bookList.add(new Book("삼국지"));
		bookList.add(new Book("해리포터와 마법사의 돌"));
		bookList.add(new Book("삼국지"));
		bookList.add(new Book("삼국지"));
	}
	
	
}
