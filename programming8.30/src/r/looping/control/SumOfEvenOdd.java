package r.looping.control;

import java.util.Scanner;

public class SumOfEvenOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value : ");
	int n= sc.nextInt();
	int esum=0 ,osum=0;
	for(int i=1;i<=n;i++) {
		if(i%2==0)
		esum=esum+i;
		else
			osum=osum+i;
	}
	System.out.println("Sum of even numbers :"+ esum);
	System.out.println("Sum of odd numbers: "+osum);
}
}
