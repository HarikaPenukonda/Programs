//Program to find whether the sum of the square of a
//digits of a number is equal to number

package programs;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, r, a = 0, temp;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number");
		n = input.nextInt();
		temp = n;
		while (n!= 0) {
			r = n % 10;
			a = a + (r * r);
			n = n / 10;

		}

		if (temp == a) {
			System.out.println("sum of square of" + n + "is equal to itself");
		} else {
			System.out.println("sum of squares of digits of" + n + "is not2 equal to itself");
		}

	}
      
}
