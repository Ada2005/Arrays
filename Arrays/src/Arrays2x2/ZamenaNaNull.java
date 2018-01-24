package Arrays2x2;

import java.util.Scanner;

public class ZamenaNaNull {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int s = sc.nextInt();
		int [][] arr = new int [s][s];
		/*
		 * 0 0 0 0   // i0
		 * 0 1 0 0
		 * 0 0 2 0
		 * 0 0 0 3
		 */
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) {
					arr[i][j] = i;
				} else {
					arr[i][j] = 0;
				}
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
