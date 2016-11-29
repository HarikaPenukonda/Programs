//Program to check whether number is palindrome or not

package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, r, reverse = 0, temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to check");
		n = input.nextInt();
		temp = n;
		while (n != 0)
		{
			r = n % 10;
			reverse = reverse * 10 + r;
			n = n / 10;
			}
		System.out.println("Reverse of entered number is:"+reverse);
		if(temp==reverse)
		{
			System.out.println("The number" +n+ "is a palindrome");
		}
		else
		{
			System.out.println("The number"+n+"is not a palindrome");
		}

	}

}
