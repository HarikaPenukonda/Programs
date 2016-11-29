//Program to calculate sum of even number from 1 to n

package programs;

import java.util.Scanner;

public class SumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("calculate sum of even number from 1 to n");
		n=input.nextInt();
		i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("sum of even number from 1 to "+ n +" is " +sum);

	}

}
