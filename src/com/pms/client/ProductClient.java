package com.pms.client;

import java.util.Scanner;

import com.pms.details.ProductDetails;
import com.pms.details.RegisterationDetails;
import com.pms.details.UserDetails;

public class ProductClient 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		RegisterationDetails rd = new RegisterationDetails();
		ProductDetails pd = new ProductDetails();
		UserDetails ud = new UserDetails();
		
		while(true)
		{
			System.out.println("**************************************");
			System.out.println("*              1)Admin               *");
			System.out.println("*              2)Customer            *");
			System.out.println("*              3)Register            *");
			System.out.println("*              4)Exit                *");
			System.out.println("**************************************");
			
			System.out.println("Enter your choice: ");
			int choice = console.nextInt();
			
			switch(choice)
			{
			case 1: 
				System.out.println("Enter username: ");
				String username = console.next();
				
				System.out.println("Enter password: ");
				String password = console.next();
				
				if(rd.verifyAdmin(username, password))
				{
					System.out.println("Login successfull..");
					System.out.println();
					pd.productMenu();
				}
				else
				{
					System.out.println("sorry wrong username or password..");
				}
				
				break;
			case 2:
				System.out.println("Enter username: ");
				String username1 = console.next();
				
				System.out.println("Enter password: ");
				String password1 = console.next();
				
				if(rd.verifyCustomer(username1, password1))
				{
					System.out.println("Login successfull..");
					System.out.println();
					ud.userMenu();
				}
				else
				{
					System.out.println("sorry wrong username or password..");
				}
				break;
			case 3:
				rd.registerAccount();
				break;
			case 4:
				System.out.println("Thank you and good bye!");
				System.exit(0);
				break;
				
				default: System.out.println("Choose 1 to 4 between..");
			} //End of switch case
			
			
		} //End of while loop
	}
}
