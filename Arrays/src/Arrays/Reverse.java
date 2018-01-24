package Arrays;
import java.util.*;
import java.io.*;

public class Reverse {
	
	public static void main(String[] args) {
	
		int i = 0, size, a = 0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr [] = new int [size];
 
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (i=0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		for (i = 0; i < size / 2; i++) {
				a = arr[i];
				arr[i] = arr[size-i-1];
				arr[size-i-1] = a;
			}
		System.out.println();
		for (i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
