/**
 * Task: Triangle Array Analysis
 *
 * Create a triangular (non-uniform) 2D array of integers where each row has one more element than the previous.
 * Fill the array with random numbers.
 * Calculate and print the minimum, maximum, and average values across the entire array.
 * Then, create a mirrored copy of the array (each row reversed),
 * and repeat the same statistical calculations.
 * Both the original and mirrored arrays should be printed to the console.
 */
 
import java.lang.Math;

public class TriangleAnalyzer {
    public static void main(String[] args) {
		int l = 10; //how many lines
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int count = 0;
		
		//initialise 2d array of integers
		int myArray[][] = new int [l][];
		int myMirrovedTriangleArray[][] = new int [l][];
		
		
		//original array
		System.out.println("Input Array:");
		System.out.println(" ");
		for(int i = 0; i<l; i++){
			myArray[i] = new int[i+1];//create array so that each line has one more element
			
			for(int j = 0; j<=i; j++){
				myArray[i][j]= (int)(Math.random() * 10); 	//fill the array with random numbers 0-9
				System.out.print(myArray[i][j] + " ");
				 
				//calculate min,max,sum
				if(myArray[i][j] > max){
					max = myArray[i][j];
				 }
				 
				if(myArray[i][j] < min){
					min = myArray[i][j];
				 }
				 
				sum = sum + myArray[i][j];
				count++;
				 
			}
			System.out.println(" ");
		}
		
		//printout calculations
		System.out.println(" ");
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("avg: "+(sum/count));
		
		System.out.println(" ");
		System.out.println(" ");
		
		

		
		
		//mirrored copy 
		System.out.println("Mirrored Array:");
		System.out.println(" ");
		
		for(int i = 0; i<l; i++){
			myMirrovedTriangleArray[i] = new int[i+1];//create array so that each line has one more element
			for(int j = 0; j<=i; j++){
				myMirrovedTriangleArray[i][j]= myArray[i][i-j]; // i-j <- AAAAAAAA !!!! FUUU
				System.out.print(myMirrovedTriangleArray[i][j] + " ");
				 
				//calculate min,max,sum
				if(myArray[i][j] > max){
					max = myArray[i][j];
				 }
				 
				if(myArray[i][j] < min){
					min = myArray[i][j];
				 }
				 
				sum = sum + myArray[i][j];
				count++;
			
				 
			}
			System.out.println(" ");
		}
		//printout calculations
		System.out.println(" ");
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("avg: "+(sum/count));
		
		System.out.println(" ");
		System.out.println(" ");
    }
}


//creation: 	https://stackoverflow.com/questions/19647718/creating-and-printing-a-triangular-array-in-java
//mirroring: 	
