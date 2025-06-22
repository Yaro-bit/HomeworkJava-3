package RegexInJava;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchApp {
	public static void main(String[] args) {

		// initialise values we are working with
		Scanner scan = new Scanner(System.in);
		String data = "";

		// simple menu
		System.out.println("Hello this is your REGEX searcher");
		System.out.print("Please enter your REGEX: ");
		String userInput = scan.nextLine();
		System.out.println("=================================");

		// copy paseted and changed - https://www.w3schools.com/java/java_files_read.asp
		// so i filled "String data" from top of the code
		try {
			File myObj = new File("src/RegexInJava/textfile");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data = data + myReader.nextLine() +"\n"; // data is my full string will text
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// copy pasted and changed - https://www.w3schools.com/java/java_regex.asp
		// function to serach for text with regex in my String data

		Pattern pattern = Pattern.compile(userInput, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(data);
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		System.out.println("=================================");
		System.out.println();
		System.out.println(data);
	}
}
