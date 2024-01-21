package a;
import java.util.Scanner;
public class even {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(evenno(n));

	}
	static boolean evenno(int n) {
		return n%2==0;
	}

}
