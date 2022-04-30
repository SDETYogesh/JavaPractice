package r.methods;

import java.util.Scanner;

//decimal-binary octal-hexa 
public class ConertInMultipleForms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value: ");
		int dec = sc.nextInt();
		System.out.println("Binary Equivalant is "+decToBin(dec));
	    System.out.println("Octa Equivalant is "+decToOct(dec));
		System.out.println("Hexa Equivalant is "+decToHex(dec));
	}
	 static String decToBin(int dec) {
		String bin="";
		do
		{
		int r= dec%2;
		bin = r+bin;
		dec=dec/2;
		} while(dec!=0);
		return bin;
	}
	 static String decToOct(int dec) {
			String oct="";
			do
			{
			int r= dec%8;
			oct = r+oct;
			dec=dec/8;
			} while(dec!=0);
			return oct;
		}
	 static String decToHex(int dec) {
			String hex="";
			do
			{
			int r= dec%16;
			if(r<10)
			hex = r+hex;
			else
				hex=(char)(r+55)+hex;
			dec=dec/16;
			} while(dec!=0);
			return hex;
		}
}
