package ObjectOrientedProgramming;

public class Trainee extends Person {
	private int grade;

	public Trainee(String name, int age) {
		super(name, age);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Trainee [grade=" + grade + ", name=" + name + ", age=" + age + "]";
	}
	
}
