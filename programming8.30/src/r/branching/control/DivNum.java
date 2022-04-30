package r.branching.control;
import java.util.Scanner;
public class DivNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		if(n%3== 0)
			System.out.println("Sanju");
		else if(n%5== 0)
			System.out.println("Geeta");
		else if (n%3==0 || n%5==0)
			System.out.println("Sanju Weds Geeta");
		else
			System.out.println("Break Up");
	}

}
