//Program to print a multiplication table

package programs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer to print its multiplication table");
		n=input.nextInt();
		System.out.println("Multiplication table of" +n+ "is:");
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
			
		}

	}

}
