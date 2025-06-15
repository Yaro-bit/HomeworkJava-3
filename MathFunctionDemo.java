package task_2;

/**
 * Task: - Define basic arithmetic functions: Sum, Sub, Mult, Div - Use them to
 * operate on two given numbers - Implement a recursive method that sums the
 * result `l` times - Print all results
 */
public class MathFunctionDemo {

	public static void main(String[] args) {

		// Initialize two input values
		double x = 1.25;
		double y = 2.4;

		// Call math operations
		double sum = sum(x, y);
		double sub = sub(x, y);
		double div = div(x, y);
		double mult = mult(x, y);

		// Call recursive summation
		int l = 3;
		double result = recursiveSum(x, y, l);
		System.out.println("Recursive result: " + result);

		// Print results of individual operations
		System.out.println("Sum: " + sum);
		System.out.println("Subtraction: " + sub);
		System.out.println("Division: " + div);
		System.out.println("Multiplication: " + mult);

		/*
		 * // Attempted loop-based summation (incorrect syntax, left commented) for (int
		 * i = 0; i < 3; i++) { sumTo3 += sum(x, y); // Correct would be: sumTo3 +=
		 * sum(x, y); } System.out.println("Test: " + sumTo3);
		 */
	}

	/**
	 * Recursively sums x and y, `l` times
	 */
	public static double recursiveSum(double x, double y, int l) {
		if (l <= 0) {
			return 0;
		}
		return sum(x, y) + recursiveSum(x, y, l - 1);
	}

	public static double sum(double x, double y) {
		return x + y;
	}

	public static double sub(double x, double y) {
		return x - y;
	}

	public static double div(double x, double y) {
		return x / y;
	}

	public static double mult(double x, double y) {
		return x * y;
	}
}
