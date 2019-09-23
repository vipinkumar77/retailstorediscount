package com.retail.store.discount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.retail.store.discount.dto.Constants;
import com.retail.store.discount.dto.Items;
import com.retail.store.util.Common;

public class MainClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter user type Employee/Affiliate/Customer: ");
		Scanner scan = new Scanner(System.in); 
		String userType=scan.nextLine();
		//String userType="Employee";
		double totalAmount = new MainClass().getTotalBill(userType);
		Common.itemList.stream().forEach(items->System.out.println(items.getItemName()+"  "+items.getPrice()));
		System.out.println("Your Total Bill: "+totalAmount);
		
	}
	
	public double  getTotalBill(String userType)
	{
		return Common.getTotalBill(Constants.getCustomerType(userType).getRate(),Common.itemList);
		
	}
	
	
	
	
}
