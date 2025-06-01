package EXAM;

import java.util.Scanner;

public class SymmetricMatrix {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows of matrix");
		int rows=sc.nextInt();
		System.out.println("enter the number of columns of matrix:");
		int cols=sc.nextInt();
		
		int a[][]=new int [rows][cols];
		System.out.println("enter the elements of matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
			System.out.println();	
		}
		System.out.println("the entered matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		if(rows!=cols) {
			System.out.println("the matrix is not a squae matrix..");
		}else {
			boolean Symmetric=true;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(a[i][j]!=a[j][i]) {
						Symmetric=false;
						break;
					}
				}
			}if(Symmetric) {
				System.out.println("the matrix is symmetric");
				
			}else {
				System.out.println("the matrix is not Symmetric");
			}
			
			
		}
		
	}

}
