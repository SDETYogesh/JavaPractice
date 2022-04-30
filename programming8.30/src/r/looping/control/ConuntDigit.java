package r.looping.control;

import java.util.Scanner;

public class ConuntDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//While loop
//		int sum=0,i=1;
//		while(i<=0) {
//			sum=sum+i;
//			i++;
//		}
		//for loop
		int sum=0;
		for( int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of 1st"+n+"natural numbers"+sum);
	}

}
