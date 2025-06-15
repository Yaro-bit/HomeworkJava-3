package SchoolNotesManager;

public class Student {
	String name;
	int note;
	

	
	public Student(String name, int note) {
		this.name = name;
		this.note = note;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", note=" + note + "]";
	}
	
}
