package com.pms.details;

import java.util.List;
import java.util.Scanner;

import com.pms.client.ProductClient;
import com.pms.impl.CustomerDaoImpl;
import com.pms.pojo.Product;

public class UserDetails
{
	Scanner console = new Scanner(System.in);
	CustomerDaoImpl cdl = new CustomerDaoImpl();
	
	public void userMenu()
	{
		while(true)
		{
			System.out.println("********************************************");
			System.out.println("*              1)View All Product          *");
			System.out.println("*              2)Search Product            *");
			System.out.println("*              3)Buy Product               *");
			System.out.println("*              4)Back                      *");
			System.out.println("********************************************");

			System.out.println("Enter your choice: ");
			int choice = console.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("*******LIST OF PRODUCTS********");
				System.out.println("ID \t NAME \t  QTY \t PRICE");
				
				List<Product> list = cdl.viewAllProducts();
				if(list != null)
				{
					for(Product pro: list)
					{
						System.out.println(pro.getpId() + "\t " + pro.getpName() + "\t " + pro.getpQty()+ "\t $" + pro.getpPrice());
					}
				}
				
				else
				{
					System.out.println("There is no product..");
				}
				System.out.println("*******************************");
				break;
			case 2:
				System.out.println("Enter id to search product: ");
				int searchProduct = console.nextInt();
				
				Product product = cdl.searchProduct(searchProduct);
				
				System.out.println(product.getpId() + "\t " + product.getpName() + "\t " + product.getpQty()+ "\t $" + product.getpPrice());
				break;
			case 3:
				System.out.println("Enter id to buy product: ");
				int buyProduct = console.nextInt();
				
				System.out.println("Enter qty to buy product: ");
				int qty = console.nextInt();
				
				Product p = cdl.buyProduct(buyProduct);
				
				int remainingQty = p.getpQty() - qty;
				
				if(remainingQty <= 0 && qty > p.getpQty())
				{
					System.out.println("Out of stock, can buy up to.. " + p.getpQty());
					
				}
				else
				{
					System.out.println("Remaining quantity: "+ remainingQty);
					p.setpQty(remainingQty);
				}
				break;
			case 4:
				ProductClient.main(null);
				break;
				default:
					System.out.println("Choose option from 1 to 4..");
			
			} //end of switch case
			
		} // End of while loop
		
	} // end of method
}
