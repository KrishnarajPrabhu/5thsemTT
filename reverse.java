/*Given integer x. Write a code to print its reverse.
ReverseOfx(123) → 321
ReverseOfx(-123) → -321
ReverseOfx(406) → 604.
*/


package ss;
import java.util.Scanner;
public class reverse 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the value for x:");
		int x=scan.nextInt();
		System.out.println(reverseofx(x));
	}
	static int reverseofx(int num)
	{
		int rev=0;
		if(num>0)
			while(num>0)
			{
				rev=rev*10+num%10;
				num=num/10;
			}
		else
			while(num<0)
			{
				rev=rev*10+num%10;
				num=num/10;
			}
		return rev;
	}
}
