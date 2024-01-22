/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
*/

package a;
import java.util.Scanner;
public class thirdone {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(DoubleSum(a,b));
	}
	static int DoubleSum(int a,int b)
	{
		return (a==b)? (a*a*a) : (a+b);
	}

}
