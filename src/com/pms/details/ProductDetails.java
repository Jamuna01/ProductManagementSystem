package com.pms.details;

import java.util.List;
import java.util.Scanner;

import com.pms.client.ProductClient;
import com.pms.impl.ProductDaoImpl;
import com.pms.pojo.Product;

public class ProductDetails 
{
	Scanner console = new Scanner(System.in);
	ProductDaoImpl pdl = new ProductDaoImpl();
	Product product = new Product();
	
	public void productMenu()
	{
		while(true)
		{
			System.out.println("****************PRODUCT DETAILS*************");
			System.out.println("*              1)Add Product               *");
			System.out.println("*              2)View All Product          *");
			System.out.println("*              3)Search Product            *");
			System.out.println("*              4)Update Product            *");
			System.out.println("*              5)Delete Product            *");
			System.out.println("*              6)Back                      *");
			System.out.println("********************************************");

			System.out.println("Enter your choice: ");
			int choice = console.nextInt();

			switch (choice) 
			{
			case 1:
				pdl.addProduct();
				productMenu();
				break;
			case 2:
				System.out.println("*******LIST OF PRODUCTS********");
				System.out.println("ID \t NAME \t  QTY \t PRICE");
				
				List<Product> list = pdl.viewAllProducts();
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
			case 3:
				System.out.println("Enter product id:");
				int pid = console.nextInt();
				System.out.println("*******LIST OF PRODUCTS********");
				System.out.println("ID \t NAME \t  QTY \t PRICE");
				Product pd = pdl.searchProduct(pid);
				System.out.println(pd.getpId() + "\t " + pd.getpName() + "\t " + pd.getpQty()+ "\t $" + pd.getpPrice());
				System.out.println("*******************************");
				break;
			case 4:
					System.out.println("Enter id to update: ");
					int update = console.nextInt();
					pdl.updateProduct(update);
					
					 
				
				break;
			case 5:
				System.out.println("Enter id to delete: ");
				int deleteId = console.nextInt();
				
				pdl.deleteProduct(deleteId);
				System.out.println("Product deleted successfully..");
				
				break;
			case 6:
				ProductClient.main(null);
				break;

			default:
				System.out.println("Choose 1 to 4 between..");
			} // End of switch case

		} // End of while loop
	}
	

	
}
