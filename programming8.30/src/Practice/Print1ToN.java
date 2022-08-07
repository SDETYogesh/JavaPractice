package Practice;

import java.util.Scanner;

public class Print1ToN {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of n" );
		int n = scan.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}

	}

}
