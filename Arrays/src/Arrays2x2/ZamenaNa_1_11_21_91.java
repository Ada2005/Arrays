package Arrays2x2;

import java.util.Scanner;

public class ZamenaNa_1_11_21_91 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int [][] arr = new int [n][n];
		/*
		 1  2  .. 10   
		 11 12 .. 20
		 21 22 .. 30
		 .. .. .. ..
		 91 92 .. 100
		 */
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 10*i + j + 1;
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
