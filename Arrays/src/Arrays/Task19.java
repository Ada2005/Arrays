package Arrays;
import java.util.*;
import java.io.*;

public class Task19 {
	
	public static void main(String[] args) {
	
		int i = 0, x, index = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		int M [] = new int [x];
		
		for (i = 0; i < x; i++) {
			M[i] = sc.nextInt();
		}
		for (i=0; i < x; i++) {
			if (M[i] > 0) {
				index += 1;
			} 
		}
		System.out.println(index);
		}
}
