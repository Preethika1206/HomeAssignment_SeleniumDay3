package week1.day3.HomeAssignemt;

public class Library {

	public String addBook(String bookTitle) {
	//
		return bookTitle;

	}

	public void issueBook() {
		System.out.println("Book issued Successfully");

	}
	public static void main(String[] args) {

		Library books = new Library();
		String bookAdded = books.addBook("The Secret");
		System.out.println(bookAdded+" Book Added Successfully");
		books.issueBook();
	}

}
