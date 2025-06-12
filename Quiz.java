// Knowledge test – Java tasks:
// Create a program `Quiz.java` that:
// - Asks the user to input five values (byte, short, int, String, boolean).
// - Compares them to expected values: 127, "127-test", true.
// - If the answer is correct, increase the score by 1; if incorrect, decrease it by 1.
// - At the end, display the number of correct and incorrect answers.
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        int score = 0;
       
        int correct = 0;
        int wrong = 0;
        
         
        String userInput; 
        Scanner scan = new Scanner(System.in);
        
        //reference values for comparison
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        
        short maxS = Short.MAX_VALUE;
        short minS = Short.MIN_VALUE;
        
        byte maxB = Byte.MAX_VALUE;
        byte minB = Byte.MIN_VALUE;
        
        System.out.println("***************************");
        System.out.println("Welcome to simple Quiz game");
		System.out.println("Score: "+score);
		System.out.println("***************************");
		System.out.println();
		
		
		
		System.out.println("Enter MAX or MIN value for Byte !");
		System.out.print("\nEnter your value:");
		userInput = scan.nextLine();
		
		if(Integer.valueOf(userInput) == maxB || Integer.valueOf(userInput) == minB){
			System.out.println("Success ! It is " + minB + " or " + maxB);
			score++;
			correct++;
		}else{
			System.out.println("Failed ! It is " + minB + " or " + maxB);
			if(score!=0){
				score--;
				}
			wrong++;
		}
		
		
		
		System.out.println("Enter MAX or MIN value for Short !");
		System.out.print("\nEnter your value:");
		userInput = scan.nextLine();
		
		if(Integer.valueOf(userInput) == maxB || Integer.valueOf(userInput) == minB){
			System.out.println("Success ! It is " + minS + " or " + maxS);
			score++;
			correct++;
		}else{
			System.out.println("Failed ! It is " + minS + " or " + maxS);
			if(score!=0){
				score--;
				}
			
			wrong++;
		}
		
		
		
		System.out.println("Enter MAX or MIN value for Integer !");
		System.out.print("\nEnter your value:");
		userInput = scan.nextLine();
		
		if(Integer.valueOf(userInput) == maxB || Integer.valueOf(userInput) == minB){
			System.out.println("Success ! It is " + minInt + " or " + maxInt);
			score++;
			correct++;
		}else{
			System.out.println("Failed ! It is " + minInt + " or " + maxInt);
			if(score!=0){
				score--;
				}
			wrong++;
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("***************************");
		System.out.println("Your score: "+score);
		System.out.println("correct answers: "+correct);
		System.out.println("wrong answers: "+wrong);
		System.out.println("***************************");
    }

}
