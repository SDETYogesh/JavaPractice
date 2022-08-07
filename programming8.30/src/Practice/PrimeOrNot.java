package Practice;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number:   ");
		int n = sc.nextInt();
		int i;
		if(n==1) {
			System.out.println("Prime start from 2");
		}
		for(i=2;i<n;i++) {
			if(n%i==0) 
				System.out.println(n+" is not a prime number");
				break;
			}
		if (n==i) 
			System.out.println(n+" is a prime number");
		}
		
	}
