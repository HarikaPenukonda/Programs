package programs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("before swapping: "+x+" " +y);
		
		/*swapping logic*/
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping: "+x+" " +y);
		

	}

}
