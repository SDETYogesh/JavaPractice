package r.branching.control;
import java.util.Scanner;
public class MainDaySwitchCase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input: ");
		int d = sc.nextInt();
		switch(d) {
		case 1 : System.out.println("Sunday");
		break;
		case 2 : System.out.println("Mon");
		break;
		case 3 : System.out.println("Tus");
		break;
		case 4 : System.out.println("weds");
		break;
		case 5 : System.out.println("Thrus");
		break;
		case 6 : System.out.println("Fri");
		break;
		case 7 : System.out.println("Sat");
		break;
		default : System.out.println("Invalid");
		}
		
	}

}
