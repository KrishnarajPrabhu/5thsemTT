/*Given positive integer X. print the nearest prime number to the given X.
NearesPrime(11) → 11
NearestPrime(25) → 23
NearestPrime(21)  → 19 23
NearestPrime(6)  → 5    7
*/

package ss;
import java.util.Scanner;
public class primeno 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the positive number:");
		int x=scan.nextInt();
		NearestPrime(x);
	}
	static boolean CheckPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	static void NearestPrime(int n)
	{
		for(int i=n-2;i<=(n+2);i++)
			if(CheckPrime(i))
				System.out.print(i+" ");
	}

}
