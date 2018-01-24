package Arrays2x2;

import java.util.Scanner;
import java.util.Random;

public class SumVerhaNiza {
	public static void main(String[] args) {
		int s, sum = 0, k = 1;
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		int[][] arr = new int[s][s];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = r.nextInt(9) + 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	/*	for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					sum += arr[i][j];
				}
					if (j == s-k && j != i) { 
					sum += arr[i][j];
					}
					
				//	if (i == 0 && i !=j || i == s-1 || j == 0 && j != 0 || j == s-1) { 
					if (i == 0 && i != j || i == s-1 && j != s-k) {
					sum += arr[i][j];
						}
				}
			k++;
			}
		*/
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j >= i && j <= s+1-i) {
					sum += arr[i][j];
				}
			}
		}
		
		System.out.println("Summa = " + sum);
	}
}