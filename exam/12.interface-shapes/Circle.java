package EXAM;
import java.util.Scanner;

public class Circle  implements AP{
	int r=0;
	double area=0,perimeter=0;
	
	@Override
	public void input(Scanner sc) {
		System.out.println("enter the radius of the circle: ");
		r=sc.nextInt();
		
		
	}
	@Override
	public void area() {
		area=3.14*r*r;
		System.out.println("the area of the circle is : "+area);
		
	}@Override
	public void perimeter() {
		perimeter=2*3.14*r;
		System.out.println("the perimeter of the circle is : "+perimeter);
		
	}

}
