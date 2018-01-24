package Functions;

import java.util.Scanner;

public class FuncMinFour {
	public static void main (String[] args) {
		Funcmin fm = new Funcmin();
		int a, b, c, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		System.out.println("Min = " + fm.minimum(a, b, c, d));
	}

}
