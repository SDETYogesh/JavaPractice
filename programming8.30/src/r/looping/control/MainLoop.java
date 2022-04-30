package r.looping.control;

import java.util.Scanner;

public class MainLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n = sc.nextInt();
		int i =2;
		int fact = 1;
		while (i <=n) {
			fact = fact*i;
			i++;
		}
		System.out.println(n+"!="+fact);
	}

}
