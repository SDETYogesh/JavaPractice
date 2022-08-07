package Practice;

import java.util.Scanner;

public class MultiplicationTables {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		System.out.println("Enter Value of p");
		int p = sc.nextInt();
		for(int i =1;i<=p;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
