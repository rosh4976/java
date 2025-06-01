package EXAM;

import java.util.Scanner;

public class MatrixAdd {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows in matrix A:\n");
		int p=sc.nextInt();
		System.out.println("enter the number of columns in matrix A:\n");
		int q=sc.nextInt();
		System.out.println("enter the number of rows in matrix B:\n");
		int m=sc.nextInt();
		System.out.println("enter the number of columns in matrix B:\n");
		int n=sc.nextInt();
		if(p==m && q==n) {
			int a[][]=new int [p][q];
			int b[][]=new int [m][n];
			System.out.println("enter the elements of matrix A:");
			for(int i=0;i<p;i++) 
				for(int j=0;j<q;j++) 
					a[i][j]=sc.nextInt();
			System.out.println("enter the elements of matrix B:");
			for(int i=0;i<m;i++) 
				for(int j=0;j<n;j++) 
					b[i][j]=sc.nextInt();
			System.out.println("matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) { 
					System.out.print(a[i][j]+ " ");}
			    System.out.println();}
			System.out.println("matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(b[i][j]+ " ");}
			    System.out.println();}
			System.out.println("the sum of two matrix is:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.print((a[i][j]+b[i][j])+" ");
			}
			    System.out.println();	}
		}else {
			System.out.println("the matrixes cant be added!!");
		}
		sc.close();
	}
	

}
