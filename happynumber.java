/*happy number
positive number-replace thenumber by sum of square of its digits
repeat the process unmtil the number ewquals 1 or it will loop endlessly in a cycle which does not end in 1.
return true if number is happy
false if not*/

package tt;
import java.util.Scanner;
public class happynumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean x= happynumber(n);
		if(x)
			System.out.println("Happy number");
		else
			System.out.println("Unhappy number");
			
	}
	static boolean happynumber(int num)
	{
		while(true)
		{
			int sum=0;
			while(num>0)
			{
				sum=sum+(num%10*num%10);
				num=num/10;
			}
		if(sum==1)
			return true;
		else if(sum==4)
			return false;
		else
			num=sum;
		}
	}
}
