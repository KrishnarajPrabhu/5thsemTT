package a;
import java.util.Scanner;
public class thirdone {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(DoubleSum(a,b));
	}
	static int DoubleSum(int a,int b)
	{
		return (a==b)? (a*a*a) : (a+b);
	}

}
