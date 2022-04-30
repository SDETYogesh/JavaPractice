package r.branching.control;
import java.util.Scanner;
public class DistanceConv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in cm: ");
		double cent = sc.nextDouble();
		double inc = 0.394*cent;
		System.out.println("Distance: "+inc+" inches");
		double foot = 0.032*cent;
		System.out.println("Distance: "+foot+" foots");
		double met = 0.01*cent;
		System.out.println("Distance: "+met+" meters");
		
	}

}
