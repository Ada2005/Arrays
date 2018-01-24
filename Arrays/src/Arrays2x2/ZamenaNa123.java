package Arrays2x2;

import java.util.Scanner;

public class ZamenaNa123 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int [n][n];
		/*
		 * 1 2 3 4   // i0
		 * 0 1 2 3
		 * 0 0 1 2
		 * 0 0 0 1
		 */
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 0;
				if (i == j) {
					arr[i][j] = 1;
				} else if (i > j) {
					arr[i][j] = 0;
		//			arr[i][j] = (n + i + 1) - (n + j); this string makes the matrix a mirror image
				} else arr[i][j] = (n + j + 1) - (n + i);
				}
		}
						
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
