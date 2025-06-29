import java.util.*;
import java.io.*;

public class CalculateSimpleInterest {
	
	public static void main (String[] args) {
		System.out.println("7. Write a Program to Calculate Simple Interest in Java ");
		Scanner scan = new Scanner(System.in);
		
		//I = Prt
		System.out.print("Enter your value P: ");
		float p = scan.nextFloat();
		System.out.print("Enter your value R: ");
		float r = scan.nextFloat();
		System.out.print("Enter your value T: ");
		float t = scan.nextFloat();
		float i = (p*r*t)/100;
		System.out.println("Simple Interest:" + i);
		
		
	}
}

