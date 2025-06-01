package EXAM;
import java.util.Scanner;
public class Cars {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of products:");
		int n=s.nextInt();
		s.nextLine();
		Product minProduct=null;
		for (int i=1;i<=n;i++) {
			System.out.println("enter details for the product"+i+":");
			System.out.println("enter the product name:");
			String name=s.nextLine();
			System.out.println("enter the product code:");
			String code=s.nextLine();
			System.out.println("enter the product price:");
			int price=s.nextInt();
			s.nextLine();
			Product product=new Product(name,code,price);
			System.out.println("details for product"+i+":");
		    product.display();
			if(minProduct==null||product.getPrice()<minProduct.getPrice()) {
				minProduct=product;
		
			}
		}
		System.out.println("Displaying product with lowest price:");
		minProduct.display();
		s.close();
		
		
	}

}
