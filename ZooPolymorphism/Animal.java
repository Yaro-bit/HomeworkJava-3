package ZooPolymorphism;

public class Animal {
	int id;
	String name;

	public void makeSound() {
	}

	public Animal(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Animal(Cat cat) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}
	
}
