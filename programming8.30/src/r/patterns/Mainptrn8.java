package r.patterns;

import java.util.Scanner;

public class Mainptrn8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print (j + " ");
			}
			System.out.println();
		}
	}
}
