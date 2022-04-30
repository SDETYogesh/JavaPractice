package r.looping.control;

import java.util.Scanner;

public class MainArmStrong {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum =0,t=n;
		do {
			int d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		} while(n!=0);
		if(sum==t)
			System.out.println(t+"is Armstrong");
		else
			System.out.println(t+"is not Armstrong");
		}
	}
