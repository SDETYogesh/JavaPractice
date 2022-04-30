package r.branching.control;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter A value: ");
			int v = sc.nextInt();
			if(v%2 == 0)
				System.out.println("Entered Value "+v+" Is an Even Number");
			else
				System.out.println("Entered Value "+v+" Is an Odd Number");
		}
		
	}

}
