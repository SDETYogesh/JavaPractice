package r.branching.control;
import java.util.Scanner;
public class rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length:");
		int l = sc.nextInt();
		System.out.print("Enter Width: ");
		int w= sc.nextInt();
		double ar = l*w;
		double pre = 2*l*2*w;
		System.out.println("Premeter of rectangle is :"+pre+"  unit sq");
		System.out.println("Area of rectangle is :"+ar+"  unit sq");
	}
	

}
