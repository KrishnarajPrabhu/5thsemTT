/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
*/

package z;
import java.util.Scanner;
public class stringntimes {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=scan.nextInt();
		System.out.println(stringtime(str,n));
		
	}
	static String stringtime(String str,int n) 
	{
		String nstr="";
		for(int i=0;i<n;i++)
			nstr=nstr+str;
		return nstr;
	}

}
