package Tyss;

import java.util.Scanner;

public class CountWord {
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string : ");
		String s = sc.nextLine();
		String nst="";
		int nc =0;
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				nst=nst+nc;
				nc=0;
				
			}
			else
				nc++;
				nst=nst+s.charAt(i);	
		}
		nst=nst+nc;
		System.out.println("no of char are  "+ nst);
	}
	

}
