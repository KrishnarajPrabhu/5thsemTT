/*Given positive integer X. Find the sum of prime digits of X is a Prime or not. Return true if it is a prime number. 
 Else return false.
PrimeDigitSum(1234)  —> true [ 2+3 = 5]
*/


package ss;
import java.util.Scanner;
public class sumofprime 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the positive integer:");
		int x=scan.nextInt();
		int res=PrimeDigitSum(x);
		if(checkprime(res))
			System.out.print(PrimeDigitSum(res));
	}
	static boolean checkprime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	static int PrimeDigitSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			if(checkprime(digit))
			{
				sum=sum+digit;
			}
			n=n/10;
		}
		return sum;
	}

}
