package tt;
import java.util.Scanner;
public class progc 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==0)
			System.out.println("Already zero");
		else if(n>0)
				pos(n);
		else
				neg(n);
			
	}
	static void pos(int n)
	{
		for(int i=n;i>=0;i--)
			System.out.print(i+" ");
	}
	static void neg(int n)
	{
		for(int i=n+1;i<=0;i++)
			System.out.print(i+" ");
	}

}
