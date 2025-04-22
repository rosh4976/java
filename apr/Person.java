package MODULE3;

public class Person {
    String name;
    String gender;
    String address;
    int age;

    Person() {}

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    String company_name, qualification;
    float salary;

    Employee() {}

    Employee(String name, String gender, String address, int age, int empid, String company_name, String qualification, float salary) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}


class Teacher extends Employee {
    String subject, department;
    int teacherid;

    Teacher(String name, String gender, String address, int age, int empid, String company_name, String qualification,
            float salary, int teacherid, String subject, String department) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.teacherid = teacherid;
        this.subject = subject;
        this.department = department;
    }

    public void display() {
        System.out.println("Teacher ID: " + teacherid);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}
