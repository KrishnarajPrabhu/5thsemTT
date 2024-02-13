/*Zero Converter:
You are given a number n. The number n can be negative or positive. 
If n is negative, print numbers from n to 0 by adding 1 to n in the neg function. 
If positive, print numbers from n-1 to 0 by subtracting 1 from n in the pos function.
Your Task:
This is a function problem. You need to take input of test cases. Just complete the functions pos() and neg().
Constraints:
-103 <= x <= 103
*/

package z;
import java.util.Scanner;
public class ZeroConvertor 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");
		int n=scan.nextInt();
		System.out.print("\n");
		if(n==0)
			System.out.println("Already zero");
		else if(n>0)
			pos(n);
		else
			neg(n);
	}
	static void pos(int n)
	{
		for(int i=n-1;i>=0;i--)
			System.out.print(i+" ");
	}
	static void neg(int n)
	{
		for(int i=n;i<=0;i++)
			System.out.print(i+" ");
	}
}
