package r.looping.control;

import java.util.Scanner;

public class DigitsOfNumber {
 public static void main(String[] args) {
	Scanner SAC = new Scanner("System.in");
	int a,b,c,d=0;
	System.out.println("Enter number: ");
	a = SAC.nextInt();
	b=a;
	while(a>0) {
		a=a/10;
		d++;
	}
	while (b>0) {
		c=b%10;
		System.out.println("Digit at place"+d+"is: "+c);
		b=b/10;
		d--;
	}	}
}

