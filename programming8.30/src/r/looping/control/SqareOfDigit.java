package r.looping.control;

import java.util.Scanner;

public class SqareOfDigit {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value :");
		int n = sc.nextInt();
		int sum = 0;
		while(n!= 0)
		{
			int r = n%10;
			sum=sum+(r*r);
			n= n/10;
		} 
		
		System.out.println("sum of sqare digits :"+sum);
		
	}
}
