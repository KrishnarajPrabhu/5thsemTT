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
