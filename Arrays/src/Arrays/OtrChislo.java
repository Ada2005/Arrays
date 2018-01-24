package Arrays;

import java.util.Scanner;

public class OtrChislo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter length of Array: ");
		Scanner sc = new Scanner(System.in);
		
		int index = 0, a = 1, razmerMassiva = sc.nextInt();
		
		int [] massiv = new int [razmerMassiva];
		
		for(int i = 0; i < razmerMassiva; i++) {
			massiv[i] =  sc.nextInt();
		}
		
		for(int i = 0; i < razmerMassiva; i++) {
				if (massiv[i]<0) {
				break;
			}
				a *= massiv[i];
		}
		System.out.println(a);
		

	}

}
