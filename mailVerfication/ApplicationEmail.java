package task_1;

import task_1.UserRepo;

import java.util.Scanner;

/*User (need registration with email/pw):
test if:
-@gmail.com (and more) <- Test is this right Capitals ?
-pw is correct ? 
-pw must be strong (Capital, small, numbers, spec. char.)
*/
public class ApplicationEmail {

	public static void main(String[] args) {

		System.out.println("Please enter your email: ");
		Scanner scan = new Scanner(System.in);
		
		String email = scan.nextLine();
		email = email.toLowerCase();
		//System.out.println("test:"+email);
		
		System.out.println("Please enter your pw: ");
		String pw = scan.nextLine();
		char[] myPwArray = pw.toCharArray();
		
		
		int pwDigits = 0;
		boolean smallLetters = false;
		boolean capitalLetters = false;
		boolean specChar = false;
		
		
		
		boolean pwtest = false;
		
		
		if (email.contains("@gmail.com")||
				email.contains("@hotmail.com")||
				email.contains("@yahoo.com") 
				&& pwtest == true
				) {
			User user1 = new User(pw, email);
			System.out.println("Success");
		} else {
			System.out.println("Wrong entry");
			System.out.println("Please enter your email: ");
			scan = new Scanner(System.in);
			email = scan.nextLine();
			System.out.println("Please enter your pw: ");
			pw = scan.nextLine();
		}
	}
	
	static boolean checkUsingIsDigitMethod(String input) {
		   for (char c : input.toCharArray()) {
		      if (Character.isDigit(c)) {
		         return true;
		      }
		   }

		   return false;
		}
}
