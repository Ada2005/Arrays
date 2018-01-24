package Arrays;
import java.util.*;
import java.io.*;

public class Task21 {
	
	public static void main(String[] args) {
	
		int i = 0, x, a = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int M [] = new int [x];
		
		for (i = 0; i < x; i++) {
			M[i] = sc.nextInt();
		}
		for (i=0; i < x; i++) {
			System.out.print(M[i] + " ");
		}
		for (i = 0; i < x; i+=2) {
			if (i < x) {
				a = M[i];
				M[i] = M[i + 1];
				M[i + 1] = a;
			}
			else {
				break;
			} 
		}
		System.out.println();
		for (i = 0; i < x; i++) {
			System.out.print(M[i] + " ");
		}
	}
}

