package tt;
import java.util.Scanner;
public class fourth {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(value(a,b));
		
	}
	static int value(int a,int b) {
		int n1=Math.abs(10-a);
		int n2=Math.abs(10-b);
		int x=(n1==n2)?0:(n1<n2)?a:b;
		return x;
	}

}
