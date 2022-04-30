package r.branching.control;
import java.util.Scanner;
public class EvenoddWithoutModule {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int v = sc.nextInt();
		if(v/2*2==v)
			System.out.println(v+" is an even number.");
		else
			System.out.println(v+" is an odd number.");
	}

}
