package ObjectOrientedProgramming;

public class MainApp {
	public static void main(String[] args) {
		
		
		//Inheritance with Trainee and Trainer
		Trainer max = new Trainer ("Max Maxwell", 44);
		max.setSubject("Algebra"); //incapsulation set & get
		Trainee min = new Trainee ("Minim Minimus", 22);
		min.setGrade(12);
		
		//Abstraction with Person
		//Person pers = new Person(); -- abstract class Person 
		
		
		
		//Polymorphism is toString
		System.out.println(max);
		System.out.println(min);
	}
}
