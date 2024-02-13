/*Write a simple ATM Program to display the following options and perform the user-selective operation until the user 
exits from the program.
· Initial account pin is 1234 and the balance of the user is 0.
· Read the PIN from the user and if it matches then print and execute the following operations as per user selection.
1. Deposit
2. Withdraw
3. Balance enquiry
4. PIN change
5. Exit
· Return the total available balance after the deposit.
· Return the total available balance after the withdrawal.
· Return the total available balance after the Balance check.
· Return “PIN Change” after the pin change operation.
Transaction(1) : input: 5000 output:5000
*/

package z;
import java.util.Scanner;
public class BankMoney 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int pin = 1234;
		double balance = 0;
		System.out.println("Enter the pin:");
		int userpin=scan.nextInt();
		if(pin==userpin)
		{
			while(true)
			{
				System.out.println("Enter your choice\n1.Deposit\n2.Withdraw\n3.Balance enquiry\n4.PIN change\n5.Exit");
				int ch=scan.nextInt();
				switch(ch)
				{
				case 1: balance=Deposit(balance);
						break;
				case 2:	balance=Withdraw(balance);
						break;
				case 3: BalanceEnquiry(balance);
						break;
				case 4:	pin=PinChange(pin);
						break;
				case 5:System.exit(0);
						break;
				default: System.out.println("Invalid Choice");
				}
			}
		}
	}
	static double Deposit(double bal)
	{
		System.out.println("Operation chosen:     Deposit");
		System.out.println("Enter the amount you want to deposit:");
		double amt=scan.nextDouble();
		bal=bal+amt;
		System.out.println("Total balance: "+bal);
		return bal;
	}
	static double Withdraw(double bal)
	{
		System.out.println("Operation chosen:     Withdraw:");
		System.out.println("Enter the amount you want to withdraw:");
		double amt=scan.nextDouble();
		bal=bal-amt;
		System.out.println("Total balance: "+bal);
		return bal;
	}
	static double BalanceEnquiry(double bal)
	{
		System.out.println("Operation chosen:     Balance Enquiry");
		System.out.println("Total balance: "+bal);
		return bal;
	}
	static int PinChange(int pin)
	{
		System.out.println("Operation chosen:     Change PIN");
		System.out.println("Enter the new pin:");
		pin=scan.nextInt();
		System.out.println("New pin: "+pin);
		return pin;
	}

}
