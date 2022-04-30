package r.looping.control;

import java.util.Scanner;

public class EvenOddCount {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("enter value : ");
	int n= scan.nextInt();
	int ecount=0 ,ocount=0;
	for(int i=1;i<=n;i++) {
		if(i%2==0)
		ecount++;
		else
			ocount++;
	}
	System.out.println("Sum of even numbers :"+ ecount);
	System.out.println("Sum of odd numbers: "+ocount);
}
}
