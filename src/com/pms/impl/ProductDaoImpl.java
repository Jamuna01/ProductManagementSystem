package com.pms.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDao;
import com.pms.pojo.Product;

public class ProductDaoImpl implements ProductDao
{

	Scanner console = new Scanner(System.in);
	static List<Product> pList = new ArrayList<>();
	
	@Override
	public void addProduct()
	{
		int k = 1;
		while(k == 1)
		{
		System.out.println("Enter product id: ");
		int id = console.nextInt();
		
		System.out.println("Enter product name: ");
		String name = console.next();
		
		System.out.println("Enter product quantity: ");
		int qty = console.nextInt();
		
		System.out.println("Enter product price: $");
		double price = console.nextDouble();
		
		Product pro = new Product(id, name, qty, price);
		
		pList.add(pro);
		
		System.out.println("Do you want to add more products: ");
		System.out.println("Press 1 for yes 2 for no");
		
		k = console.nextInt();
		} // end of while loop
	}

	@Override
	public List<Product> viewAllProducts()
	{
		
		return pList;
	}

	@Override
	public Product searchProduct(int id)
	{
		if(pList != null)
		{
			for(Product p: pList)
			{
				if(p.getpId() == id)
				{
					return p;
				}
			}
		}
		return null;
	}

	@Override
	public void deleteProduct(int id)
	{
		
		int k = 0;
		if(pList != null)
		{
			for(Product p: pList)
			{
				k++;
				if(p.getpId() == id)
				{
					
					pList.remove(p);
					break;
				}
			}
		}
		if(k == 0)
		{
			System.out.println("can't find the product..");
		}
	}

	@Override
	public void updateProduct(int id)
	{
		if(pList != null)
		{
			for(Product p: pList)
			{
				if(p.getpId() == id)
				{
					System.out.println("What you want to update ");
					System.out.println("Press:\n1) Name\n2) Qty\n3)Price");
					int select = console.nextInt();
					
					switch(select)
					{
					case 1:
						System.out.println("Enter product name: ");
						String name = console.next();
						p.setpName(name);;
						System.out.println("Product name updated to " + name);
						break;
					case 2:
						System.out.println("Enter product qty: ");
						int qty = console.nextInt();
						p.setpQty(qty);
						System.out.println("Product quantity updated to " + qty);
						break;
					case 3:
						System.out.println("Enter product price: ");
						double price = console.nextDouble();
						p.setpPrice(price);
						System.out.println("Product price updated to $" + price);
						break;
						default:
							System.out.println("Press number to update..");
				} //end of switch case
			}
		}
	}
	}

}
