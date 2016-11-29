package programs;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r;
		double a,p;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		r=input.nextInt();
		a=3.14*r*r;
		p=2*3.14*r;
		System.out.println("The area of the circle is "+a);
		System.out.println("The perimeter of the circle is "+p);
		

	}

}
