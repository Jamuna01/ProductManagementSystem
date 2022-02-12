package com.pms.details;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.pojo.Admin;
import com.pms.pojo.Customer;


public class RegisterationDetails 
{
	Scanner console = new Scanner(System.in);
	List<Admin> adminList = new ArrayList<>();
	List<Customer> userList = new ArrayList<>();
	
	Admin admin = null;
	Customer cust = null;
	
	public void registerAccount()
	{
		
		System.out.println("Are you admin or customer: ");
		String ans = console.next();
		
		System.out.println("Enter id: ");
		int id=console.nextInt();
		
		System.out.println("Enter first name: ");
		String fname=console.next();
		
		System.out.println("Enter last name: ");
		String lname=console.next();
		
		System.out.println("Enter email: ");
		String email=console.next();
		
		System.out.println("Enter username: ");
		String uname=console.next();
		
		System.out.println("Enter password: ");
		String pass=console.next();
		
		if(ans.equalsIgnoreCase("admin"))
		{
			admin = new Admin(id, fname, lname, email, uname, pass);
			adminList.add(admin);
			
			System.out.println("Admin registered successfully..");
			
		}
		else if(ans.equalsIgnoreCase("customer"))
			
		{
			cust = new Customer(id, fname, lname, email, uname, pass);
			userList.add(cust);
			
			System.out.println("Customer registered successfully..");
		}
		else
		{
			System.out.println("Sorry, something went wrong..");
		}
	}
	
	public boolean verifyAdmin(String uname, String pass)
	{
		boolean status = false;
		
		if(adminList != null)
		{
			for(Admin ad: adminList)
			{
				if(ad.getAdminUName().equals(uname) && ad.getAdminPassword().contentEquals(pass))
				{
					return status = true;
				}
			}
		}
		
		
		return status;
	}
	
	public boolean verifyCustomer(String uname, String pass)
	{
		boolean status = false;
		
		if(userList != null)
		{
			for(Customer cu: userList)
			{
				if(cu.getCuName().equals(uname) && cu.getCuPassword().equals(pass))
				{
					return status = true;
				}
			}
		}
		
		return status;
		
	}
}
