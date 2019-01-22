import java.util.Scanner;

public class InvoiceClass 
{

	public static void main(String args[])
	{
			Boolean validate=false;
			int myInt=0;
		    String newLine = System.getProperty("line.separator");
			Scanner in = new Scanner(System.in);
			System.out.println("How many $1 widgets would you like to buy?");
			String quantity= in.nextLine();
			myInt=validate(quantity);
			Calc(myInt);
				
	}
	
	public static int validate(String quantity)
	{
		int myInt=0;
		try 
		{
				
			myInt=Integer.parseInt(quantity);			
			return myInt;
		}
		catch(Exception e)
		{
			 System.out.println("You entered something that was not a number...");
			 return myInt;
		}
		
	}
	public static void Calc(int quantity)
	{
		
		double percentNum=0.0;
		double myDiscount;
		double myTotal;
		
		if(quantity>=500)
		{
			System.out.println("You saved 20% on your purchase.");
			percentNum=.20;
					
		}
		else if(quantity>=250 & quantity<500)
		{
			System.out.println("You saved 15% on your purchase.");
			percentNum=.15;
		}
		else if(quantity>=100 & quantity<250)
		{
			System.out.println("You saved 10% on your purchase.");
			percentNum=.10;
		}
		myDiscount=(quantity*percentNum);
		if(myDiscount>0)
		{
			System.out.println("Your total discount is $"+myDiscount);
		}
		myTotal=quantity-myDiscount;
		System.out.println("Your total purchase is $"+myTotal);
				
	}
}
