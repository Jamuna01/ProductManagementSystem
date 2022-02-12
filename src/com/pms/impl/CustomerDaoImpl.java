package com.pms.impl;

import java.util.ArrayList;
import java.util.List;

import com.pms.dao.CustomerDao;
import com.pms.dao.ProductDao;
import com.pms.pojo.Product;

public class CustomerDaoImpl implements CustomerDao
{
	
	ProductDao pdl = new ProductDaoImpl();
	List<Product> productList = new ArrayList();
	@Override
	public List<Product> viewAllProducts()
	{
		List<Product> custList = pdl.viewAllProducts();
		
		return custList;
	}

	@Override
	public Product searchProduct(int id) 
	{
		if(viewAllProducts() != null)
		{
			for(Product p: viewAllProducts())
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
	public Product buyProduct(int id)
	{
		if(viewAllProducts() != null)
		{
			for(Product p: viewAllProducts())
			{
				if(p.getpId() == id)
					
				{
					return p;
				}
			}
		}
		return null;
	}


}
