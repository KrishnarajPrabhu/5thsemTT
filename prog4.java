package tt;
import java.util.Scanner;
public class prog4 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=scan.nextInt();
		System.out.println(stringtimes(str,n));
	}
	static String stringtimes(String str,int n)
	{
		String cstr="";
		for(int i=0;i<n;i++)
			cstr=cstr+str;
		return cstr;
	}

}
