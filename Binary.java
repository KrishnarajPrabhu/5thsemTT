/*Given positive integer x. Write a program to print a Binary number of x.
BinaryNum(23) → 10111
BinaryNum(124) → 1111100
BinaryNum(234) → 11101010
*/

package ss;
import java.util.*;
public class Binary {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to convert it into binary number:");
		int x=scan.nextInt();
		Binarynum(x);
	}
	static void Binarynum(int x)
	{
		String num=Integer.toBinaryString(x);
		System.out.println(num);
	}

}
