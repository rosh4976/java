package EXAM;

public class Teacher extends EmployeeT{
	String department,subject;
	public Teacher(int empid,String name,float salary,String address,String department,String subject) {
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
		
	}
	public void display() {
		System.out.println("teachers id:"+empid);
		System.out.println("teachers name: "+name);
		System.out.println("teachers salary: "+salary);
		System.out.println("teachers address: "+address);
		System.out.println("teachers department: "+department);
		System.out.println("teachers subject: "+subject);
		
	}

}
