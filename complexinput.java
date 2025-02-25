import java.util.Scanner;

package MODULE1;

public class ComplexNumber {

    double real, img;

    ComplexNumber(double r, double i) {
        real = r;
        img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for the first complex number
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double img1 = scanner.nextDouble();
        
        // Input for the second complex number
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double img2 = scanner.nextDouble();
        
        // Create complex numbers
        ComplexNumber c1 = new ComplexNumber(real1, img1);
        ComplexNumber c2 = new ComplexNumber(real2, img2);
        
        // Calculate the sum
        ComplexNumber temp = sum(c1, c2);
        
        // Output the result
        System.out.println("Sum is: " + temp.real + " + " + temp.img + "i");

        scanner.close();  // Close the scanner
    }
}
