package r.branching.control;
import java.util.Scanner;
public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value1: ");
		int v1= sc.nextInt();
		System.out.println("Enter value2: ");
		int v2= sc.nextInt();
		System.out.println("Enter value3: ");
		int v3= sc.nextInt();
		int small = v1;
				if(small >v2)
					small=v2;
				if(small > v3)
					small=v3;
		System.out.println("Smallet value is: "+small);
	}

}
