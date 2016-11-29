package programs;

import java.util.Scanner;

public class FactorialRecursion {

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact = 1,number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = input.nextInt();
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);

	}

}
