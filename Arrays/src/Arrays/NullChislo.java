package Arrays;

import java.util.Scanner;

public class NullChislo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0, size, a = 0, index = 0;
		
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int [] massive = new int [size];
				
		for (i = 0; i < size; i++) {
		massive [i] = sc.nextInt();
		}
		for(i = 0; i < size; i++) {
			if (massive[i] == 0) {
			break;
		}
			a += massive[i];
	}
	System.out.println(a);
	}

}
