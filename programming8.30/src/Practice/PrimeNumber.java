package Practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER : ");
		int n = sc.nextInt();
		System.out.println(" Prime Numbers Between 1 to "+n);
		//loop through the numbers one by one
		for(int i =0;i<= n;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					isPrime=false;
					break;
				}
				//print the numb
			}
			if(isPrime)
				System.out.println(i+"");
		}	
	}
}
