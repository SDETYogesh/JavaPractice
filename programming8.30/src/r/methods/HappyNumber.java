package r.methods;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int tem=n;
		while(tem>9) {
			tem=sumSqDigit(tem);
		}
		if (tem==1)
			System.out.println(n+" is a Happy number");
		else
			System.out.println(n+" is not a Happy number");
	}
static int sumSqDigit(int n) {
	int sum=0;
	while(n!=0) {
		int d=n%10;
		sum+=d*d;
		n/=10;
	}
	return sum;
}
}
