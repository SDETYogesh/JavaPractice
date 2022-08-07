package Practice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String str = sc.nextLine();
		
		String Org_str=str;
		String rev = "";
		int len= str.length();
		
		for(int i =len-1;i>0;i--)
		{
			rev= rev+str.charAt(i);
		}
		if(Org_str.equals(rev))
		{
			System.out.println(Org_str+" is a Palindrome String");
		}
		else
		{
			System.out.println(Org_str+" is not a Palindrome String");
	
		}
	}

}
