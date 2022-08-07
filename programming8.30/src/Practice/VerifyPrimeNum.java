package Practice;

import java.util.Scanner;

public class VerifyPrimeNum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt();
		int i;
		if(n==1) 
		{
			System.out.println("Prime Starts from 2");
		}
		for(i=2;i<n;) 
		{
			if(n%i==0)
				System.out.println("not a prime number");
			break;
		}
		if (n == i) {
			System.out.println("is prime number");
		}
			
	}
	

}
