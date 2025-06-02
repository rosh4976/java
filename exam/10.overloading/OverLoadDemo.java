package EXAM;

import java.util.Scanner;

public class OverLoadDemo {
	void area(float x){
		System.out.println("the area of Square is "+Math.pow(x,2)+" sq units");
		
	}
	void area(float x,float y) {
		System.out.println("the area of rectangle is "+(x*y)+" sq units");
	}
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("the area of circle is "+z+" sq units");
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		OverLoadDemo ob=new OverLoadDemo();
		System.out.println("enter the side of the square: ");
		float side=sc.nextFloat();
		ob.area(side);
		System.out.println("enter the length of rectangle: ");
		float length=sc.nextFloat();
		ob.area(length);
		System.out.println("enter the breadth of the rectangle: ");
		float breadth=sc.nextFloat();
		ob.area(breadth);
		System.out.println("enter the radius of the square: ");
		double radius=sc.nextDouble();
		ob.area(radius);
		sc.close();
		
		
		
		
	}

}
