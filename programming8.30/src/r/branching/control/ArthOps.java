package r.branching.control;
import java.util.Scanner;
public class ArthOps {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Integer Value1: ");
		int v1 = sc.nextInt();
		System.out.print("Enter Integer Value2: ");
		int v2 = sc.nextInt();
		//operations
		int add = v1+v2;
		System.out.println("Addition of values: "+add);
		int sub = v1-v2;
		System.out.println("Subtaction of valuses: "+sub);
		int mul = v1*v2;
		System.out.println("Multiplication of valuses: "+mul);
		int div = v1/v2;
		System.out.println("Division of valuses: "+div);
		int rem = v1%v2;
		System.out.println("Reminder of valuses: "+rem);
	}

}
