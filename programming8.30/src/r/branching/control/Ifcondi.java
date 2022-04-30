package r.branching.control;
import java.util.Scanner;
public class Ifcondi {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value:  ");
		int n = sc.nextInt();
		if (n<0)
			n=n*-1;
		System.out.println("Entered Value is: "+n);
	}

}
