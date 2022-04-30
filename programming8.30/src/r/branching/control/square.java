package r.branching.control;
import java.util.Scanner;
class square{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Side of square :");
		double s = sc.nextDouble();
		double pr = 4*s;
		double ar = s*s;
		System.out.println("side length of square is:"+s);
		System.out.println("area of sqare is:"+ar);
		System.out.println("premiter of square is:"+pr);
	}
}