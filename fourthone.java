/* 
Given 2 int a and b, return true if one of them is 10 or if their sum is 10.
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/

package a;
import java.util.Scanner;
public class fourthone {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(Return10(a,b));
	}
	static boolean Return10(int a,int b)
	{
		return (a==10 || b==10 || a+b==10) ? true : false;
	}

}
