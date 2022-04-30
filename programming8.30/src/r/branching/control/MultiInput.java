package r.branching.control;
import java.util.Scanner;
public class MultiInput {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value1:");
		int a = sc.nextInt();
		System.out.println("Enter the value2: ");
		int b = sc.nextInt();
		System.out.println("Enter the valuse3: ");
		int c = sc.nextInt();
		int big = a;
		if(big < b)
			big = b;
		if(big < c)
			big = c;
		System.out.println("The biggest number is : "+big);
		
	}

}