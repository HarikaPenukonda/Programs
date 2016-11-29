package programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:");
		count=input.nextInt();
		System.out.println(n1+" "+n2);
		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}

	}

}
