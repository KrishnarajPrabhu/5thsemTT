package tt;
import java.util.Scanner;
public class addition 
{
	static Scanner scan=new Scanner(System.in);
	static int n=scan.nextInt();
	public static void main(String[] args)
	{
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter first array:");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println("Enter second array:");
		for(int i=0;i<n;i++)
			b[i]=scan.nextInt();
		int c[]=sumofarr(a,b);
		System.out.println("Sum of array:");
		PrintElements(c);
	}
	static void PrintElements(int x[]) {
		for(int i:x)
			System.out.print(i+" ");
	}
	static int[] sumofarr(int a[],int b[]) 
	{
		int c[]=new int[n];
		for(int i=0;i<n;i++)
			c[i]=a[i]+b[i];
		return c;
	}

}
