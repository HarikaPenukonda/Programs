package programs;

import java.util.Scanner;

public class Loop2 {
	public static void recursive(int n) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		n = input.nextInt();
	
		if(n<=10)
		{
			System.out.println(n);
			recursive(n++);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recursive(1);

	}

}

