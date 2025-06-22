package LibraryIncapsulation;

public class Book {
	private String name;
	private String author;
	private long sides;

	public Book(String name, String author, long sides) {
		super();
		this.name = name;
		this.author = author;
		this.sides = sides;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getSides() {
		return sides;
	}

	public void setSides(long sides) {
		this.sides = sides;
	}

	@Override
	public String toString() {
		return "Book [name: " + name + ", author: " + author + ", sides: " + sides + "]";
	}
	
}
