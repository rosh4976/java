package EXAM;
import java.util.Scanner;

public class ComplexNumber {
	double real,img;
	ComplexNumber(double r,double i){
		real=r;
		img=i;
		
	}
	public  void display() {
		System.out.println(real +"+"+img+"i");
	}
	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the real part of the first complex number:");
		double c1r=sc.nextDouble();
		System.out.println("enter the imaginery part of the first complex number:");
		double c1i=sc.nextDouble();
		System.out.println("enter the real part of the second  complex number:");
		double c2r=sc.nextDouble();
		System.out.println("enter the imaginery part of the second complex number:");
		double c2i=sc.nextDouble();
		System.out.println("first complex number:");
		ComplexNumber c1=new ComplexNumber(c1r,c1i);
		c1.display();
		System.out.println("second  complex number:");
		ComplexNumber c2=new ComplexNumber(c2r,c2i);
		c2.display();
		System.out.println("sum of two complex number:");
		ComplexNumber temp=sum(c1,c2);
		temp.display();
		
		
		
		
	
		
		
		
				
	}
	

}
