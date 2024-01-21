package a;
import java.util.Scanner;
public class fifthone {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(if1020(a,b));
	}
	static boolean if1020(int a,int b)
	{
		return (a>=10 && a<=20 || b>=10 && b<=20) ? true : false;
	}
	
}