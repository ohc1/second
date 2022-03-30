package submit_0314.submit03;

public class Book {
	String book_name;
	int book_num;
	boolean book_check = false;
	
	Book(){}
	
	public Book(String book_name, int book_num, boolean book_check) {
		super();
		this.book_name = book_name;
		this.book_num = book_num;
		this.book_check = book_check;
	}
	
	public Book(String book_name) {
		Library book = Library.getInstance();
		this.book_name = book_name;
		this.book_num = book.bookList.size() + 1;
	}

	@Override
	public String toString() {
		if(true) {
			return "[책 이름: " + book_name + ", 책 번호: " + book_num + ", 대여 여부: 대여중 " + "]";
		}else {
			return "[책 이름: " + book_name + ", 책 번호: " + book_num + ", 대여 여부: 입고중"  + "]";
		}
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getBook_num() {
		return book_num;
	}

	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}

	public boolean isBook_check() {
		return book_check;
	}

	public void setBook_check(boolean book_check) {
		this.book_check = book_check;
	}
	
	
	
	
}
