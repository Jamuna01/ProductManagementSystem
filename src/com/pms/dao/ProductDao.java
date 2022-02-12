package com.pms.dao;

import java.util.List;

import com.pms.pojo.Product;

public interface ProductDao 
{
	void addProduct();
	List<Product> viewAllProducts();
	Product searchProduct(int id);
	void deleteProduct(int id);
	void updateProduct(int id);
}
