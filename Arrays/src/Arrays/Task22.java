package Arrays;
import java.util.*;
import java.io.*;

public class Task22 {
	
	public static void main(String[] args) {
	
		int i = 0, x, sum = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int M [] = new int [x];
		
		for (i = 0; i < x; i++) {
			M[i] = sc.nextInt();
		}
		for (i=0; i < x; i++) {
			if (M[i] > 0) {
				sum += M[i];
			} 
		}
		System.out.println(sum);
		}
}
