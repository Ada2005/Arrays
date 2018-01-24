package Arrays2x2;

import java.util.Scanner;
import java.util.Random;

public class StrokaPoVozr {
	public static void main(String[] args) {
		int size, temp;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[][] arr = new int[size][size];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = r.nextInt(9)+1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > arr[i+1][j]) {
					temp = arr[i][j];
					arr[i][j] = arr[i+1][j];
					arr[i+1][j] = temp;
						}	
					}
			}
		System.out.println("New sorted array:");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j] + " ");
			}
		}
		
}
}
	