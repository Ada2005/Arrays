package Arrays;
import java.util.*;
import java.io.*;

public class Task16 {
	
	public static void main(String[] args) {
	
		int size, min, index = 0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		Random r = new Random();
		int [] M = new int [size];
		
		// заполнение массива элементами
		for (int i = 0; i < size; i++) {
			M[i] = r.nextInt(10) + 1;
		}
		for (int i=0; i < size; i++) {
			System.out.print(M[i] + " ");
		}
		// поиск min
		min = M[0];
		for (int i = 0; i < size; i++) {
			if (min > M[i]) {
				min = M[i];
				index = i + 1;}
			}
		// вывод массива на консоль
		System.out.println();
		System.out.println(min);
		System.out.println(index);
		}
}
