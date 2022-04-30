package r.branching.control;
import java.util.Scanner;
public class DoubleComp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value1:");
		double a = sc.nextDouble();
		System.out.println("Enter the value2: ");
		double b = sc.nextDouble();
		System.out.println("Enter the valuse3: ");
		double c = sc.nextDouble();
		double big = a;
		if(big < b)
			big = b;
		if(big < c)
			big = c;
		System.out.println("The biggest double value is : "+big);
	}
}
		