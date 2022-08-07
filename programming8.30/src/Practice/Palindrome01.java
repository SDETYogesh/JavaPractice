package Practice;

import java.util.Scanner;

public class Palindrome01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int t= n;
		int rev = 0;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n= n/10;
		}
		if(rev==t)
		{
			System.out.println(t+" Is a Palindrome Number");
			
		}
		else
			System.out.println(t+" Is Not a Palindrome Number");
	}

}
