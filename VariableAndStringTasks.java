// Create variables of all types, concatenate strings, convert a string to a number, output the length of the string.
// Compare the lengths of the name and surname (two strings) and output the result.

import java.util.Scanner;

public class VariableAndStringTasks  {
	
	public static void main (String[] args) {
		
		//variables og all types
		short smallNumber = 12;
		int normalNumber = 2356;
		long bigNumber = 2131325423;
		char oneLetter = 'c';
		boolean trueOrFalse = false;
		String someText = "Here we go with some Text";
		
		System.out.println("Here all my variables listed :\n"+"\nShort: "+smallNumber+"\nInteger: "+normalNumber+ "\nLong: "+bigNumber+"\nChar: "+oneLetter+"\nString: "+someText);
		
		//concatenate string 
		System.out.println();
		String first = "I love ";
		String second = "JDK";
		System.out.println("What you love ? \n"+"Yaro: "+first+second);
			
		//convert a string to a number
		System.out.println();
		Scanner scan = new Scanner (System.in); //to use user input in command line we need to use scanner 
		System.out.print("Enter any number to convert it to number: ");
		String userInput = scan.nextLine();
		int newNumber = Integer.valueOf(userInput); //Integer.valueOf() method to convert string to integer , doble so on...
		System.out.println("Number converted: "+newNumber);
		
		//output the length of the String
		System.out.println();
		Scanner newScanner = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = newScanner.nextLine();
		int lengthOfName = name.length();
		System.out.println("Your name is "+name+" and is "+lengthOfName+" characters long");
		
		//compare the length of two strings 
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String firstname = scanner.nextLine();
		System.out.print("Enter your surname: ");
		String surname = scanner.nextLine();
		
		//comparing
		if(firstname.length()>surname.length()){
			System.out.println("Your name is "+firstname.length()+" characters long and is longer as your surname");
		}else if( firstname.length() < surname.length() ) {
			System.out.println("Your surname is "+surname.length()+" characters long and is longer as your name");
		}else{ 
			System.out.println("Surname "+surname.length()+" characters long so as your name that is "+firstname.length()+" characters long");
		}
	}
}

