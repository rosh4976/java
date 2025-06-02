package EXAM;
import java.util.Scanner;

public class IFaceDemo {
	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		
	 while(true) {
		System.out.println("menu\n 1.area of the circle\n 2.area of the rectangle\n3.perimeter of the circle\n4.perimeter of the rectangle\n5.exit\n");
		int choice;
		System.out.println("enter your choice : ");
		choice=sc.nextInt();
	    sc.nextLine();
	    
	    switch(choice) {
	    
	    case 1:
	    	
	    	c.input(sc);
	        c.area();
	        break;
	    case 2:
	    	
	    	r.input(sc);
	    	r.area();
	    	break;
	    	
	    case 3:
	    	
	    	c.input(sc);
	    	c.perimeter();
	    	break;
	    	
	    case 4:
	    	
	    	r.input(sc);
	    	r.perimeter();
	    	break;
	    	
	    case 5:
	    	
	    	System.out.println("exiting program...");
	    	return;
	    	
	    default:
	    	
	    	System.out.println("invalid option try again..");
	    	break;
	    	
	    
	    
	    
	    }
	 }
	}	

}
