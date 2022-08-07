package Practice;

import java.util.Scanner;

public class SumOf1ToN {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value of n : ");
		int n = sc.nextInt();
		int sum =0;
		for(int i=0;i<= n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
