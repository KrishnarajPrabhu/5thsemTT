/*
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 
lastDigit(7, 17) → true
lastDigit(6, 17) → false   
lastDigit(3, 113) → true
 */
package a;
import java.util.Scanner;
public class lastDigit {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(last(a,b));

	}
	static boolean last(int a, int b) {
		return a%10==b%10;
	}
}
