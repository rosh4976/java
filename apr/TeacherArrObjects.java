package MODULE3;

import java.util.Scanner;

public class TeacherArrObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of teacher " + (i + 1));
            System.out.print("Teacher ID: ");
            int tid = sc.nextInt();
            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();  // Consume leftover newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Company Name: ");
            String company_name = sc.nextLine();
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();

            teachers[i] = new Teacher(name, gender, address, age, empid, company_name, qualification, salary, tid, subject, department);
        }

        System.out.println("\n--- Teacher Details ---");
        for (Teacher t : teachers) {
            t.display();
            System.out.println();
        }

        sc.close();
    }
}
