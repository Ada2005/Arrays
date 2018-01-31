package Arrays2x2;

import java.util.Scanner;

public class PBDiag {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		int k = 1;
		
		/*
		 * 0 0 0 1   
		 * 0 0 1 2
		 * 0 1 2 2
		 * 1 2 2 2
		 */
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
				if(j == n - k) {
					arr[i][j] = 1;
					} else if (j > n - k) {
						arr[i][j] = 2;	
					}
			}
			k++;
		}
				
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
