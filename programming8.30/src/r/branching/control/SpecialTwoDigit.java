package r.branching.control;
import java.util.Scanner;
public class SpecialTwoDigit {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the two digit value: ");
		int n = sc.nextInt();
		int d1 = n/10;
		int d2 = n%10;
		int sum = d1+d2+d1*d2;
		if(sum==n)
			System.out.println(n+" Entered Value is a Special two digit number.");
		else
			System.out.println(n+" Entered Value is not a Special two digit number.");
		
	}

}
