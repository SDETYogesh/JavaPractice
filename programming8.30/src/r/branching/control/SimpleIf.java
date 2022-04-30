package r.branching.control;
import java.util.Scanner;
public class SimpleIf {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value1:");
		int a = sc.nextInt();
		System.out.println("Enter the value2: ");
		int b = sc.nextInt();
		if (a>b)
			System.out.println(a+" is the biggest value");
		if(a<b)
			System.out.println(b+" is the biggest value");
	}

}