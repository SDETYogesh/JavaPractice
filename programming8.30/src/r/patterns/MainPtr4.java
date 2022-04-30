package r.patterns;

import java.util.Scanner;

public class MainPtr4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value: ");
	int n = sc.nextInt();
			for(int i= 1; i<=n; i++) {
				for(int j=n; j>0; j++) {
					System.out.print(j+" ");
				}
		System.out.println();	
		}
	
}
}
