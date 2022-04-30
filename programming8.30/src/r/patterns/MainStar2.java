package r.patterns;

import java.util.Scanner;

public class MainStar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) //no of lines 
		{
			for (int j = i; j <= n-i; j++) //no of spaces
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) //no of stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}