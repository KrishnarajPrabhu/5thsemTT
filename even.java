/* 
Given one integer n and return true if it is an even number else return false.
Even(6) -> True.
Even(7) -> False.
Even(9) -> False.
*/
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
