package Practice;

import java.util.Scanner;

public class Palindrome02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter number : ");
		int no = sc.nextInt();
		int temp=no;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+ " is a palindrome");
		}
		else
			System.out.println(no+ " is not  a palindrome");
	}

}
