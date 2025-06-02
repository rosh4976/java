package EXAM;
import java.util.Scanner;


public class TeacherArrObjects {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of teachers: ");
		int n=sc.nextInt();
		sc.nextLine();
		Teacher teacher[]=new Teacher[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the details of teacher"+(i+1)+": ");
			System.out.println("enter teacher id: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the teacher name: ");
			String name=sc.nextLine();
			System.out.println("enter the teachers salary: ");
			float salary=sc.nextFloat();
			sc.nextLine();
			System.out.println("enter the teacher address: ");
			String address=sc.nextLine();
			System.out.println("enter the teacher department: ");
			String department=sc.nextLine();
			System.out.println("enter the teacher subject: ");
			String subject=sc.nextLine();
			Teacher t=new Teacher(id,name,salary,address,department,subject);
			teacher[i]=t;
			
			
		}
		System.out.println("teachers are: ");
		for(Teacher x:teacher) {
			x.display();
			System.out.println();
			
		}
		
		
	}

}
