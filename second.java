package tt;
import java.util.Scanner;
public class second {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		boolean weekday =scan.nextBoolean();
		boolean vacation=scan.hasNext();
		System.out.println(sleepin(weekday,vacation));
	}
	static boolean sleepin(boolean weekday,boolean vacation) {
		boolean x = (weekday==false && vacation==false)? true:(weekday==true && vacation==false)?false:(weekday==false && vacation==true)?true:false;
		return x;
	}
}
