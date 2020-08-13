package medium;

import java.util.Scanner;

//16.	Matrix multiplication

public class MatrixMultiply {

	public static void main(String[] args) {

		int m, n, p, q, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and coulmns of First matrix");
		m = sc.nextInt();
		n = sc.nextInt();

		int first[][] = new int[m][n];
		System.out.println("Enter the values of first matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				first[i][j] = sc.nextInt();
			}
		}
		for (int c = 0; c < m; c++) {
			for (int d = 0; d < n; d++) {
				System.out.print(first[c][d] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("Enter the number of rows and coulmns of Second matrix");
		p = sc.nextInt();
		q = sc.nextInt();

		int second[][] = new int[p][q];
		System.out.println("Enter the values of second matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				second[i][j] = sc.nextInt();
			}
		}
		for (int c = 0; c < p; c++) {
			for (int d = 0; d < q; d++) {
				System.out.print(second[c][d] + "\t");
			}
			System.out.print("\n");
		}
		int multiply[][] = new int[m][q];
		if (n != p) {
			System.out.println("Multiplication cannot be done");
		} else {
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < q; j++) {
					for (int j2 = 0; j2 < p; j2++) {
                    sum = sum + first[i][j2]*second[j2][j];
					}
					multiply[i][j]=sum;
					sum=0;
				}
			}
		}
		
		System.out.println("product of matrices");
		for (int c = 0; c < p; c++) {
			for (int d = 0; d < q; d++) {
				System.out.print(multiply[c][d] + "\t");
			}
			System.out.print("\n");
		}
		

		sc.close();

	}
}
