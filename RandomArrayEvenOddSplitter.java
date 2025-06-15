package task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Task: - Create an array of integers - Fill the array with random integers -
 * Print basic information about the array - Separate and store even and odd
 * numbers into separate lists - Print those lists
 */
public class RandomArrayEvenOddSplitter {

	public static void main(String[] args) {

		// 1. Initialize array
		int[] elements = { 12, 2, 3, 4, 3, 5, 656, 8745, 2, 1 };
		int length = elements.length;

		// 2. Basic info output
		System.out.println("Array length: " + length);
		System.out.println("First element (index 0): " + elements[0]);
		System.out.println("Tenth element (index 9): " + elements[9]);

		// 3. Fill array with random numbers between 0 and 19
		Random rand = new Random();
		for (int i = 0; i < elements.length; i++) {
			elements[i] = rand.nextInt(20);
			System.out.print(elements[i] + " ");
		}

		System.out.println();
		System.out.println("Array using Arrays.toString(): " + Arrays.toString(elements));

		// 4. Calculate and print memory size in bytes
		int sizeOfArray = elements.length * Integer.BYTES;
		System.out.println("Byte size of array: " + sizeOfArray);

		// 5. Even/Odd separation
		System.out.println("Even/Odd classifier:");

		List<Integer> evenElements = new ArrayList<>();
		List<Integer> oddElements = new ArrayList<>();

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				System.out.println("Even: " + elements[i]);
				evenElements.add(elements[i]);
			} else {
				System.out.println("Odd: " + elements[i]);
				oddElements.add(elements[i]);
			}
		}

		// 6. Print results
		System.out.println("Even numbers: " + evenElements);
		System.out.println("Odd numbers: " + oddElements);
	}
}
