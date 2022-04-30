package r.branching.control;
import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radius of Circle :");
		double r = sc.nextDouble();
		double ar = 3.14*r*r;
		double cir = 2*3.14*r;
		System.out.println("radius of circle is:"+r);
		System.out.println("area of circle is:"+ar);
		System.out.println("circumfrence of circle is:"+cir);
		
		
	}

}
