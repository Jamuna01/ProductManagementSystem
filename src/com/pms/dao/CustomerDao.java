package com.pms.dao;

import java.util.List;

import com.pms.pojo.Product;

public interface CustomerDao 
{
	List<Product> viewAllProducts();
	Product searchProduct(int id);
	Product buyProduct(int id);
	
}
