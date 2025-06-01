package EXAM;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in the array:");
		int count=sc.nextInt();
		sc.nextLine();
		
		int array[]=new int[count];
		
		for(int i=0;i<count;i++) {
			System.out.println("enter the "+(i+1)+"element");
			array[i]=sc.nextInt();}
		
			sc.nextLine();
	
		
		System.out.println("enter the element to search in the array:");
		int search=sc.nextInt();
		for(int i=0;i<count;i++) {
			  if(array[i]==search) {
				System.out.println("the element is present in array position"+(i+1));
				break;
			  }	
		
		
				System.out.println("the element is not present in the array");
				
			
		}
		
		
		

	}}
