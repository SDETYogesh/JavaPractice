package r.branching.control;
import java.util.Scanner;
public class ThreeDistValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value1: ");
		int v1 = sc.nextInt();
		System.out.println("Enter value2: ");
		int v2 = sc.nextInt();
		System.out.println("Enter value3: ");
		int v3 = sc.nextInt();
		if (v1 > v2 && v1< v3 || v1>v3 && v1 < v2)
			System.out.println(v2+" is the middle value");
		else if (v2>v1 && v2<v3 || v2>v3 && v2<v3)
			System.out.println(v2+" is the middle value");
		else
			System.out.println(v2+" is not middle value");
	}

}
