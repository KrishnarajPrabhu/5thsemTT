/*Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
*/

package tt;
import java.util.Scanner;
public class three 
{
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(teen(a,b,c));
	}
	static boolean teen(int a,int b,int c) {
		boolean x=(a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=13)?true:false;
		return x;
	}
}
