package com.retail.store.discount.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.retail.store.discount.Affiliate;
import com.retail.store.discount.Customer;
import com.retail.store.discount.Employee;
import com.retail.store.discount.NewCustomer;
import com.retail.store.discount.User;

public class Constants {

	
	public static User getCustomerType(String customerType)
	{
		if(customerType.equalsIgnoreCase("Employee"))
		{
			return new Employee();
		}
		else if(customerType.equalsIgnoreCase("Affilited"))
		{
			return new Affiliate();
		}
		else if(customerType.equalsIgnoreCase("Customer"))
		{
			return new Customer(); 
		}
		else
		{
			return new NewCustomer();
		}
	}
	
	
}
