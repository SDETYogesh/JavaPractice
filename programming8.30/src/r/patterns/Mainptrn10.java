package r.patterns;

import java.util.Scanner;

public class Mainptrn10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(n-i+1+ " ");
			}
			System.out.println();
		}
	}
}