package r.branching.control;
import java.util.Scanner;
public class BiggestAmong4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value1:");
		int a = sc.nextInt();
		System.out.println("Enter the value2:  ");
		int b = sc.nextInt();
		System.out.println("Enter the valuse3: ");
		int c = sc.nextInt();
		System.out.println("Enter the Value4:  ");
		int d = sc.nextInt();
		int big = a;
		if(big < b)
			big = b;
		if(big < c)
			big = c;
		if(big< d)
			big = d;
		System.out.println("The biggest number is : "+big);
		
	}

}