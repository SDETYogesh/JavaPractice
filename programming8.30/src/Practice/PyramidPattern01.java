package Practice;

import java.util.Scanner;

public class PyramidPattern01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value: ");
		int n = sc.nextInt();
		for(int i = 0;i<=n;i++)
		{
			for(int j=n;j>= i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			for(int l=2; l<=i ;l++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
	}

}
