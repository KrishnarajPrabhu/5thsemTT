package a;
import java.util.Scanner;
public class lastDigit {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(last(a,b));

	}
	static boolean last(int a, int b) {
		return a%10==b%10;
	}
}
