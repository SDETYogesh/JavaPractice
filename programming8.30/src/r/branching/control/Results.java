package r.branching.control;
import java.util.Scanner;
public class Results {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Marks: ");
		int j= sc.nextInt();
		System.out.println("Python Marks: ");
		int p= sc.nextInt();
		System.out.println("Data Science Marks: ");
		int d= sc.nextInt();
		System.out.println("Cloud Computing Marks: ");
		int c= sc.nextInt();
		if (j>=35 && p>=35&&d>=35&&c>=35)
			System.out.println("Congrats You are Pass.");
		else
			System.out.println("Unfortunatly,Fail.");
	}

}
