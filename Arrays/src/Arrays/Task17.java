package Arrays;
import java.util.*;
import java.io.*;

public class Task17 {
	
	public static void main(String[] args) {
	
		int size, even, index = 0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		Random r = new Random();
		int [] M = new int [size];
		
		// zapolnenie massiva elementami - filling an array with elements
		for (int i = 0; i < size; i++) {
			M[i] = r.nextInt(10) + 1;
		}
		for (int i=0; i < size; i++) {
			System.out.print(M[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			if (M[i] % 2 == 0) {
				System.out.print(M[i] + " ");
				}
			}
		}
}
