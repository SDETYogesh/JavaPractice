package r.branching.control;
import java.util.Scanner;
public class NumberOrDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input: ");
		int n = sc.nextInt();
		if (n >= -9 && n<= 9)
			System.out.println(n+" is a digit");
		else
			System.out.println(n+" is a number");
	}

}
