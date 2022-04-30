package r.branching.control;
import java.util.Scanner;
public class InputIdentification {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Input: ");
		int input =sc.nextInt();
		if(input<0)
			System.out.println("Given Input Is A Negative Number.");
		else
			System.out.println("Given Input Is A Positive Number.");
	}

}
