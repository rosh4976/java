package EXAM;

import java.util.Scanner;

public class Employee {
	int eNo,eSalary;
	String eName;


public Employee() {}
public Employee(int No,int Salary,String Name) {
	eNo=No;
	eSalary=Salary;
	eName=Name;
}
public void showData() {
	System.out.println("employee id = "+eNo+"\nEmployee name  "+ eName+"\nSalary = "+eSalary);
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of employees:");
	int n=sc.nextInt();
	sc.nextLine();
	
	System.out.println("enter the employee details one by one ..");
	Employee employees[]=new Employee[n];
	for(int i=0;i<n;i++) {
		System.out.println("enter the details of employee:"+(i+1));
		System.out.println("enter the employee id(integer): ");
		int eid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the employee name : ");
		String ename=sc.nextLine();
		System.out.println("enter the employee salary:");
		int esal=sc.nextInt();
		
		sc.nextLine();
		Employee emp=new Employee(eid,esal,ename);
		employees[i]=emp;
		
		
		
	}
	System.out.println("employees are : \n");
			for(Employee y:employees)
				y.showData();
	System.out.println("enter the employee id to search: ");
	int search=sc.nextInt();
	sc.nextLine();
	boolean found=false;
	for(Employee e:employees) {
		if(search==e.eNo) {
			found=true;
			System.out.println("employee found.. ");
			e.showData();
			break;
		}}
	if(!found) {
		System.out.println("employee not found..");
	
		
		}sc.close();
		
	}
			
			
	
	
}

