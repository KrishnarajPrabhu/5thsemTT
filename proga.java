package tt;
import java.util.Scanner;
public class proga 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{    
		int n=scan.nextInt();
		System.out.println(even(n));

	}
	static boolean even(int n) 
	{
		if(n%2==0)
			return true;
		else
			return false;
		
	}

}
