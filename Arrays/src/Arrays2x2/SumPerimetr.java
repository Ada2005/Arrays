package Arrays2x2;

import java.util.Scanner;
import java.util.Random;

public class SumPerimetr {
	public static void main(String[] args) {
		int size, sum = 0;
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
				if (i == 0 || i == size-1 || j == 0 || j == size-1) {
					sum += a[i][j];
				}
			}
		}
		System.out.println("Summa = " + sum);
	}
}	
