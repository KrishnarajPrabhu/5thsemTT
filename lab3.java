package tt;
import java.util.Scanner;
public class lab3 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
		System.out.println("Enter elements of b array:");
		for(int i=0;i<5;i++)
			b[i]=scan.nextInt();
		System.out.println("The first array elements are:");
		PrintElements(a);
		System.out.println("The second array elements are:");
		PrintElements(b);
	}
	static void PrintElements(int x[]) {
		for(int i:x)
			System.out.println(i);
	}
}
