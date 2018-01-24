package Arrays2x2;

import java.util.Scanner;
import java.util.Random;

public class Max2Elem {
	public static void main(String[] args) {
		int size, max1, max2, temp;
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
		max1 = arr[0][0];
		max2 = arr[0][1];
			if (max1 < max2) {
				temp = max1;
				max1 = max2;
				max2 = temp;
			}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max2) {
					max2 = arr[i][j];
				
			
						if (max1 < max2) {
							temp = max1;
							max1 = max2;
							max2 = temp;
						}	
					}
				
		}
		}
		System.out.println("Max element: " + max1);
		System.out.println("Next max element: " + max2);
		
}
}
	