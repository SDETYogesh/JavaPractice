package r.branching.control;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		switch(n%2) 
		{
		case 0 : System.out.println(n+" Is Even Number.");
		break;
		case 1 : System.out.println(n+" Is Odd Number.");
		}
	}

}
