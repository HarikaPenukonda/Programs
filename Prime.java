package programs;

import java.util.Scanner;

public class Prime {
	
	int n,i,c=0;

	public void primeNumber()
	{
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		System.out.println("Enter any Number :");
		for(i=0;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c == 2)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not Prime");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime p1 = new Prime();
		p1.primeNumber();

	}

}
