/*You have a green lottery ticket, with ints a, b, and c on it.
 If the numbers are all different from each other, the result is 0. 
 If all of the numbers are the same, the result is 20. 
 If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
*/

package assignment1;
import java.util.Scanner;
public class THREE {
	
	static Scanner scan=new Scanner(System.in);
	static int a,b,c,res;
	static void ticket() {
		if(a==b && b==c && c==a)
			res=20;
		else if(a!=b && b!=c && c!=a)
			res=0;
		else if(a==b && b!=c || a==c && b!=a || b==c && a!=b)
			res=10;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the values of a,b and c:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		ticket();
		System.out.println("greenTicket("+a+","+b+","+c+")-->"+res);

	}

}
