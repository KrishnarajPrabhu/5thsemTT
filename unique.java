package tt;
import java.util.Scanner;
public class unique {
	static Scanner scan=new Scanner(System.in);
	static int n=scan.nextInt();
	public static void main(String[] args) 
	{
		System.out.print("Enter 1st array:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println("The unique elements are:");
		uniques(a);
	}
	static int[] uniques(int a[])
	{
		int count=1;
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=0;j<n;j++)
			{
				if(a[i]==a[j] && i!=j)
					break;
			}
			if(j==n)
				System.out.print(a[i]+" ");
				count++;
		}
		return a;
	}
	

}
