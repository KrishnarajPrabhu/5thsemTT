package tt;
import java.util.Scanner;
public class fifth {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(multiple(n));
	}
	static boolean multiple(int n) {
		boolean x = n%3==0?true:false;
		return x;
	}

}
