/*Use Case 01:password checking 
Give a string (password). And check if it is a valid password as per given following rules if yes print 1 else print 0

Rules:
Password should  be a minimum of 8 characters in length .
Password should contain at least one uppercase , one lower case , one special character and one digit 
It should not contain white space.
*/

package pwd;
import java.util.Scanner;
public class passwordchecker 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the password");
		String password=scan.next();
		System.out.println(isValid(password));
		
	}
	static int isValid(String password) 
	{
		boolean hasUppercase = false, hasLowercase = false, hasDigit = false, hasSplChar= false;
		if(password.length()<8)
			return 0;
		for(int i=0;i<password.length();i++) 
		{
			char ch=password.charAt(i);
			if(ch>='A' && ch<='Z')
				hasUppercase = true;
			else if(ch>='a' && ch<='z')
				hasLowercase = true;
			else if(ch>='0' && ch<='9')
				hasDigit = true;
			else if ("!@#$%^&*()-+".contains(String.valueOf(ch))) 
				hasSplChar = true;
		}
		if(password.contains(" "))
		   return 0;
		return (hasUppercase && hasLowercase && hasDigit && hasSplChar ) ? 1: 0;
	}
}