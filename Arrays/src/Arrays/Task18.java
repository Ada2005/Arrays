package Arrays;
import java.util.*;
import java.io.*;

public class Task18 {
	
	public static void main(String[] args) {
	
		int i = 0, x, index = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		Random r = new Random();
		int M [] = new int [x];
		
		// заполнение массива элементами
		for (i = 0; i < x; i++) {
			M[i] = r.nextInt(100);
		}
		for (i=0; i < x; i++) {
			System.out.print(M[i] + " ");
		}
		System.out.println();
		
		for (i = 0; i < x; i += 2) {
			System.out.print(M[i] + " ");
			}
		}
}
