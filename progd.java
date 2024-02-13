package tt;
import java.util.Scanner;
public class progd {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(isprime(a) && isprime(b))
			System.out.println(primesum(a,b));
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
	static boolean primesum(int a,int b)
	{
		return isprime(a+b);
	}

}
