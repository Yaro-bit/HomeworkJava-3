package ObjectOrientedProgramming;

public class Trainer extends Person {
	private String subject;

	public Trainer(String name, int age) {
		super(name, age);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Trainer [subject=" + subject + ", name=" + name + ", age=" + age + "]";
	}

}
