/*Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
*/





package assignment1;
import java.util.Scanner;
public class sumabc 
{
	static Scanner scan=new Scanner(System.in);
	static int a,b,c,sum;
	
	static void sum() {
		if(a==13)
			sum=0;
		else if(b==13)
			sum=a;
		else if(c==13)
			sum=a+b;
		else
			sum=a+b+c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the values of a,b and c:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		sum();
		System.out.println("luckySum("+a+","+b+","+c+")-->"+sum);

	}

}
