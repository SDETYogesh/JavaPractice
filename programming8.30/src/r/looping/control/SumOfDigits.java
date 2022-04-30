package r.looping.control;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value :");
		int n = sc.nextInt();
		int sum = 0;
		do 
		{
			int r = n%10;
			sum=sum+r;
			sum= n/10;
		} 
		while(n!= 0);
		System.out.println("sum of digits"+sum);
		
	}
}
