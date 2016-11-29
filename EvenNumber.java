package programs;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number which you want to print");
		n = input.nextInt();
		System.out.println("The even numbers from 1 to "+n+" are:");
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
