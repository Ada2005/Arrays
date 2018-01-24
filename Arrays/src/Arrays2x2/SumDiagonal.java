package Arrays2x2;

import java.util.Scanner;
import java.util.Random;

public class SumDiagonal {
	public static void main(String[] args) {
		int size, sum = 0, k = 1;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[][] a = new int[size][size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				a[i][j] = r.nextInt(9) + 1;
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					sum += a[i][j];
				}
					if (j == size-k && j != i) { 
					sum += a[i][j];
					}
				}
			k++;
			}
		System.out.println("Summa = " + sum);
	}
}