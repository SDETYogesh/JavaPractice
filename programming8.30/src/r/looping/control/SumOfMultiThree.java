package r.looping.control;

import java.util.Scanner;

public class SumOfMultiThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int n = sc.nextInt();
		int i = 1;
		int sum =0;
		while(i <= n) {
			sum = 3*1+sum;
			i++;
			System.out.println("Sum of "+3*n+" is "+sum);
		}
		
	}

}
