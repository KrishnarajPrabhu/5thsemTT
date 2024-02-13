package tt;
import java.util.Scanner;
public class maxprime 
{
	static Scanner scan=new Scanner(System.in);
	static int n=scan.nextInt();
	public static void main(String[] args) 
	{
		System.out.print("Enter 1st array:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println(maxprimes(a));
	}
	static int[] maxprimes(int a[])
	{
		int flag,max=0,j,i,x;
		for(i=0;i<n;i++)
		{
			flag=1;
			for(j=2;j<a[i]/2;j++)
				if(a[i]%j==0) {
					flag=0;
					break;
				}
			if(max==2 && a[i]>max)
				max=a[i];
			if(a[i]>max && flag==1)
				max=a[i];
			System.out.println(a[i]);
		}
		return a;
				
	}

}
