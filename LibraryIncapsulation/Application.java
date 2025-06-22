
package LibraryIncapsulation;

import java.security.Permission;
import java.util.*;

public class Application {
	public static void main(String[] args) {
		
		//while loop
		boolean exit = false;
		
		//BOOK DB
		List<Book> books = new ArrayList<Book>();
        books.add(new Book("Clean Code", "Robert C. Martin", 464));
        books.add(new Book("Effective Java", "Joshua Bloch", 416));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt", 352));
        books.add(new Book("Design Patterns", "Erich Gamma", 395));
        books.add(new Book("Introduction to Algorithms", "Thomas H. Cormen", 1312));
        books.add(new Book("Java: The Complete Reference", "Herbert Schildt", 1248));
        books.add(new Book("Head First Java", "Kathy Sierra", 720));
        books.add(new Book("Refactoring", "Martin Fowler", 448));
        books.add(new Book("Spring in Action", "Craig Walls", 520));
        books.add(new Book("Algorithms", "Robert Sedgewick", 992));
        books.add(new Book("Mein Kampf", "Adolf Hitler", 782));

		
		
		
		//programm
		while (exit != true) {
			System.out.println("===================================");
			System.out.println("Hello to your Web Book Application");
			System.out.println("===================================");
			Scanner scan = new Scanner(System.in);
			System.out.println("1. Search book by name");
			System.out.println("2. Search book by author");
			System.out.println("3. Add new book");
			System.out.println("4. Borrow book ");
			System.out.println("5. Exit ");
			System.out.println("===================================");
			System.out.print("Your value: ");
			String userInput = scan.nextLine();
			System.out.println("===================================");

			String name = "";
			String author= "";
			int sides= 0;

			switch (Integer.valueOf(userInput)) {
			case 1:
				System.out.print("Enter name of the book: ");
				name = scan.nextLine();
				for(int i = 0; i <= books.size()-1; i++) {
					Book book = books.get(i);
					if(book.getName().equals(name)) {
						System.out.println(book);
						break;
					}else if(i==books.size()-1) {
						System.out.println("Nothing found");
					}
					
				}
				break;
			case 2:
				System.out.print("Enter authors name: ");
				author = scan.nextLine();
				for(int i = 0; i <= books.size()-1; i++) {
					Book book = books.get(i);
					if(book.getAuthor().equals(author)) {
						System.out.println(book);
						break;
					}else if(i==books.size()-1) {
						System.out.println("Nothing found");
					}
				}
				break;
			case 3:
				try {
					System.out.print("Enter name of the book: ");
					name = scan.nextLine();
					System.out.print("Enter authors name: ");
					author = scan.nextLine();
					System.out.print("enter sides: ");
					sides = Integer.valueOf(scan.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Wrong entry !");
				}
		        books.add(new Book(name, author, sides));
				break;
			case 4:
				System.out.print("Enter name of the book: ");
				name = scan.nextLine();
				
				System.out.println(name+"borowed");
				break;
			case 5:
				System.out.println("Do you want to exit ? Y/N");
				if (userInput.equals("Y")) {
					exit = true;
				}

				break;
			default:
				System.out.println("Wrong entry");
			}

		}

	}
}
