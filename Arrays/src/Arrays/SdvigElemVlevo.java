package Arrays;

import java.util.Scanner;

public class SdvigElemVlevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Дан массив x [10], с помощью массива y [10] сдвинуть элемнты на число k позиций влево.
		x [1 2 3 4 5 6 7 8 9 10]    k = 4   y [4 5 6 7 8 9 10 1 2 3] */
		
		int i = 0, size, k = 4 - 1;
		
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int [] x = new int [size];
		int [] y = new int [size];
		
		for (i = 0; i < size; i++) {
		x [i] = sc.nextInt();
		}
		for (i = 0; i < size; i++) {
			y [i] = x [k];
			k++;
			if(k == size) {
				k = 0;
			}
		}
		for (i = 0; i < size; i++) {
		System.out.print(y[i] + " ");
		}
	}
}