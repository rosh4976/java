package EXAM;
import java.util.Scanner;
import java.util.Arrays;


public class Stringsort {
	
	public static void main (String [] args) {
		
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of strings to sort:");
		int count=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the strings to sort");
		String strlist[]=new String[count];
		for (int i=0;i<count;i++) {
			System.out.println("enter the "+(i+1)+" string:");
			strlist[i]=sc.nextLine();	
		}
		
		while(true){
			System.out.println("menu\n choose your option\n 1.inbuilt sort\n  2.user defined sort  \n 3.exit");
			int choice=sc.nextInt();
			sc.nextLine();
			
			
		
		
		  switch(choice)
		  {
		
		          case 1:Arrays.sort(strlist);
		                     System.out.println(Arrays.toString(strlist));
		                     break;
		          case 2:for(int i=0;i<count;i++) {
		        	        for(int j=i+1;j<strlist.length;j++) {
		        	        	if(strlist[i].compareTo(strlist[j])>0) {
		        	        		temp=strlist[i];
		        	        		strlist[i]=strlist[j];
		        	        		strlist[j]=temp;
		        	        		
		        	        	}
		        	        }
		          }  
		                 System.out.println(Arrays.toString(strlist));
		                 break;
		          case 3: System.out.println("exiting program..");
		        	     return;
		             
		        default:
		        	System.out.println("invalid option ...try again..");
		        	
		          
		}
		
	}
		
		
	}
	

}
