package tt;
import java.util.Scanner;
public class first {

	public static void main(String[] args) 
	{
		int n,x;
		Scanner scan=new Scanner(System.in);
		n= scan.nextInt();
		x=diff21(n);
		System.out.println(x);
	}
	static int diff21(int n)
	{
		int x;
		x= (n<=21) ? (x=Math.abs(n-21)) : (x=2*Math.abs(n-21));
		return x;
		
	}

}
