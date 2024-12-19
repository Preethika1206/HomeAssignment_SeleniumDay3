package week1.day3.HomeAssignemt;

public class LibraryManagement {

	public static void main(String[] args) {
		Library books = new Library();
		String booksAdded = books.addBook("The Alchemist");
		System.out.println("\'"+booksAdded+"\'"+" Book Added Successfully");
		books.issueBook();

	}

}
