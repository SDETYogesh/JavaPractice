package r.branching.control;
import java.util.Scanner;
public class ValidationOfMonth {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month value: ");
		int m = sc.nextInt();
		if (m >= 1 && m<= 12)
			System.out.println(m+" - Given input is a valid month value");
		else
			System.out.println(m+" - Given input is a invalid month value");
		
	}

}
