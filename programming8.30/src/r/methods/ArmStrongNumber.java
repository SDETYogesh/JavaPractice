
package r.methods;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1= ");
		int a = sc.nextInt();
		System.out.print("Enter n2= ");
		int b = sc.nextInt();
		findArmStrong(a,b);
		
		
	}
	static void findArmStrong(int a,int b) {
		for(int i=a;i<=b;i++) {
			int num =i;
			int sum=0;
			while(num>0) {
				int r = num%10;
				sum = sum+(r*r*r);
				num=num/10;
			}
			if(sum==i) {
				System.out.println(sum);
			}
		}
	}

}
