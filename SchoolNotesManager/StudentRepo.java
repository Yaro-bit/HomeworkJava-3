package SchoolNotesManager;

import java.util.ArrayList;

public class StudentRepo {
	public static ArrayList <Student> listOfStudents = new ArrayList<Student>();
	
	public static void saveStudents(Student s) {
		listOfStudents.add(s);
    }
	
    public static String getAllStudents() {
        return listOfStudents.toString();
    }
}
