package r.branching.control;
import java.util.Scanner;
public class ComparisonOfTwoInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value1");
		int v1= sc.nextInt();
		System.out.println("Enter Value2");
		int v2= sc.nextInt();
		if (v1 == v2)
			System.out.println("Values are Equal");
		else
			System.out.println("Valuses are not Equal");
	}

}
