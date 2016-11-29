package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,c=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
			if(c==2)
			{
				System.out.println("The number " + n +" is a prime number");
			}
			else
			{
				System.out.println("the number " + n +" is not a prime number");
				
			}
			}
		}

	


