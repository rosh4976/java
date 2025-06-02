package EXAM;
import java.util.Scanner;


public class Rectangle implements AP{
	int l,b;
	double area,perimeter;
	 
	@Override
	public void input(Scanner sc) {
		System.out.println("enter the length of the rectangle: ");
		l=sc.nextInt();
		System.out.println("enter the breadth of the rectangle: ");
		b=sc.nextInt();
		
	}
	public void area() {
		area=l*b;
		System.out.println("the area of rectangle is: "+area);
		
	}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println(" the perimeter of th rectangle is: "+perimeter);
     
	}
	
}
