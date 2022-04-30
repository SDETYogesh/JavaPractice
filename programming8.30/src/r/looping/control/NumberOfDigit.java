package r.looping.control;

import java.util.Scanner;

public class NumberOfDigit {
public static void main(String[] args) 
 {try {
	

	Scanner scan = new Scanner(System.in);
	System.out.println("Ener value: ");
	int n= scan.nextInt();
	int count=0;
	do {
		count++;
		n=n/10;
	} while(n!=0);
	System.out.println("Number of digit  "+count);
 } catch (Exception e) {
		// TODO: handle exception
	}
}
}
