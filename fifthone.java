/* 
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/

package a;
import java.util.Scanner;
public class fifthone {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(if1020(a,b));
	}
	static boolean if1020(int a,int b)
	{
		return (a>=10 && a<=20 || b>=10 && b<=20) ? true : false;
	}
	
}