import java.io.*;
import java.util.*;

public class Geekforgeeks_1_to_5 {
	
	public static void main (String[] args) {
		System.out.println("1. Hello world ");
		System.out.println("");
		System.out.println("");
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2. enter int x:");
		int x= scan.nextInt();
		System.out.print("2. enter int y:");
		int y= scan.nextInt();
		System.out.println("2. x+y="+x+"+"+y+"="+(x+y));
		System.out.println("");
		System.out.println("");
		
		
		System.out.print("3.To swap enter int A:");
		int a = scan.nextInt();
		System.out.print("3.To swap enter int B:");
		int b = scan.nextInt();
		int swap = a;
		a=b;
		b=swap;
		System.out.print("3.Swapped A: "+a+" swapped B: "+b);
		System.out.println("");
		System.out.println("");
		
		
		System.out.print("4.To convert to binary enter int n:");
		int num = scan.nextInt();
		int solution = 0;
		int rest = 0; 
		String bin = ""; 
		
		while(num!=0){
			solution = num % 2;
			bin = solution+bin;
			solution = num/2;
			num = solution;
		}
		System.out.print("4. Binary:"+bin);
		System.out.println("");
		System.out.println("");
		
		
		System.out.print("5.To find to factorial enter int input: ");
		
		int in = scan.nextInt();
		String factorialStr = "";
		int factorialNum=1;
		 
		for(int i = in; i > 0; i--){
			factorialNum *= i;
			 if(i == in){
				factorialStr += i;
			} else {
				factorialStr += "*" + i;
			}
		}
		System.out.print("5. Factorial: "+factorialStr+" = "+factorialNum);
	}
}

