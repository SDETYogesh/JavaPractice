package Practice;

import java.util.Scanner;

public class CountNoOfDigits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.println("Enter Mob No. : ");
long num = sc.nextLong();
int count =0;
while(num>0)
{
	num=num/10;
	count++;
}
if(count==10)
{
	System.out.println("accepted ->"+count+" digit number");
}
else
{
	System.out.println("Invalid Number -> "+count+" digit number");
}
}

}
