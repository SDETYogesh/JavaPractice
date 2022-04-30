package r.branching.control;
import java.util.Scanner;
public class Results2 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Sub1 Marks: ");
		int a = sc.nextInt();
		System.out.println("Enter Sub2 Marks: ");
		int b = sc.nextInt();
		System.out.println("Enter Sub3 Marks: ");
		int c = sc.nextInt();
		System.out.println("Enter Sub4 Marks: ");
		int d = sc.nextInt();
		if (a< 30 || b<30 || c<30 || d<30)
			System.out.println("Fail");
		double res= (a+b+c+d)/4.0;
		if (res>= 85)
			System.out.println("Distingtions");
		else if (res>=60 )
			System.out.println("First Class");
		else if (res>= 30)
			System.out.println("Pass");
		
	}

}
