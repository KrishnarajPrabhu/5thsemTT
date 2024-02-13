/*Write a program to implement the following Bus Ticket scenario. 
Read From stage number and To stage number.
Read the number of adult and children passengers.
Calculate the number of stages they are traveling.
Calculate adult cost @ Rs.10 per passenger per stage.
Calculate child cost @ Rs.5 per passenger per stage.
Find total ticket cost.
Find the discount of the ticket as follows:
If adults>=5 calculate a discount of 20% on ticket cost.
else If adults==4 calculate a discount of 15% on ticket cost.
else If adults==3 calculate a discount of 10% on ticket cost.
else If adults==2 calculate a discount of 5% on ticket cost.
else calculate a discount of 0% on ticket cost.
Then find the ticket cost after discount.
And also find the service charge of 5% on ticket cost.
Find the total ticket cost and display the ticket cost.
*/

package ss;
import java.util.Scanner;
public class BusTicket 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter FROM stage number:");
		int FromStageNum=scan.nextInt();
		System.out.println("Enter TO stage number:");
		int ToStageNum=scan.nextInt();
		System.out.println("Enter the number of adults:");
		int NumOfAdults=scan.nextInt();
		System.out.println("Enter the number of children:");
		int NumOfChild=scan.nextInt();
		
		int NumofStages=(ToStageNum-FromStageNum);
		System.out.println("Number of stages they are travelling:"+NumofStages);
		
		double AdultCost=10.0;
		double ChildCost=5.0;
		double TotalAdultCost=NumOfAdults*AdultCost*NumofStages;
		double TotalChildCost=NumOfChild*ChildCost*NumofStages;
		double TotalTicketCost=TotalAdultCost+TotalChildCost;
		
		System.out.println("Adult cost @ Rs.10 per passenger per stage:"+TotalAdultCost);
		System.out.println("Child cost @ Rs.5 per passenger per stage:"+TotalChildCost);
		System.out.println("Total Ticket Cost is:"+TotalTicketCost);
 
		double discount;
		if(NumOfAdults>=5)
			discount=20.0;
		else if(NumOfAdults==4)
			discount=15.0;
		else if(NumOfAdults==3)
			discount=10.0;
		else if(NumOfAdults==2)
			discount=5.0;
		else 
			discount=0.0;
		
		double TotalCostAfterDiscount=(TotalTicketCost*discount)-TotalTicketCost;
		double ServiceChargeofTicketCost=0.5*TotalCostAfterDiscount;
		double totalticketcost=TotalCostAfterDiscount+ServiceChargeofTicketCost;
		System.out.println("The ticket cost after discount."+TotalCostAfterDiscount);
		System.out.println("The service charge of 5% on ticket cost:"+ServiceChargeofTicketCost);
		System.out.println("Total Ticket Cost is:"+totalticketcost);
		

		

	}

}
