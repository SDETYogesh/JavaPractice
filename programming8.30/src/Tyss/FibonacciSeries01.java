package Tyss;

import java.util.Scanner;

public class FibonacciSeries01 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value : ");
		int n = sc.nextInt();
		int a=0; int b=1; int c=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<n;i++)
		{
			c=a+b; 
			if(c<=n) {
				System.out.println(c);
				a=b;
				b=c;
			}
		}
	}

}
