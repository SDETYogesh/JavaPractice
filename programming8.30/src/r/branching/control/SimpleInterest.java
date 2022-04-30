package r.branching.control;
import java.util.Scanner;
public class SimpleInterest {
public static void main(String[]args) {
	Scanner sac = new Scanner(System.in);
	System.out.print("Enter Principal Ammount:");
	int p = sac.nextInt();
	System.out.print("Enter Interest Rate:");
	int r = sac.nextInt();
	System.out.print("Enter Time in Years:");
	int t =sac.nextInt();
	int a = p*(1+r*t);
	System.out.print("Your Estimated Simple Interest is :"+a);
	
}
}
