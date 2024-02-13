/*Given two int values a and b. Check a and b are primes are not. 
 If a and b are primes then check if the sum of a and b is a prime or not. 
 If the prime returns true. Else return false.
SumPrime(2,3) —> true.
SumPrime(7,11) —> false.
 SumPrime(3,7) —> false
SumPrime(8,11) → false
*/

package z;
import java.util.Scanner;
public class PrimeCheck 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(isprime(a) && isprime(b))
			System.out.println(sumprime(a,b));
		else
			System.out.println(false);
		
	}
	static boolean isprime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
	static boolean sumprime(int a,int b)
	{
		return isprime(a+b);
	}

}
