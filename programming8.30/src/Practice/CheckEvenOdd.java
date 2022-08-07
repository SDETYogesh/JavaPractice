package Practice;

import java.util.Scanner;

public class CheckEvenOdd {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value : " );
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println(n+ " Is an Even Number");
			
		}
		else {
			System.out.println(n + " is an odd Number");
		}
	}

}
