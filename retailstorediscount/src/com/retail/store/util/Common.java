package com.retail.store.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.retail.store.discount.dto.Items;

public class Common {

public static List<Items> itemList=new ArrayList<Items>();
	
	static
	{
		itemList.add(new Items(1,"Maggie","G",12.5));
		itemList.add(new Items(2,"Coffee","G",70.0));
		itemList.add(new Items(3,"Rice","G",80));
		itemList.add(new Items(4,"Wheat","G",30));
		itemList.add(new Items(5,"Oil","G",150));
		itemList.add(new Items(6,"Refined Oil","G",150));
		itemList.add(new Items(7,"Water Bottel","G",20));
		itemList.add(new Items(8,"Sault","G",20));
		itemList.add(new Items(9,"Suger","G",40));
		itemList.add(new Items(10,"Daal","G",100));
		itemList.add(new Items(11,"Chair","NG",500));
		itemList.add(new Items(12,"Table","NG",700));
		itemList.add(new Items(13,"Light","NG",200));
		itemList.add(new Items(14,"Cup","NG",100));
		itemList.add(new Items(15,"Surf","NG",12.5));
		itemList.add(new Items(16,"Soap","NG",12.5));
		itemList.add(new Items(17,"Bucket","NG",12.5));
		itemList.add(new Items(18,"Bulb","NG",40));
		itemList.add(new Items(19,"Mug","NG",20));
		itemList.add(new Items(20,"Pen","NG",10));
	}

	public static double getTotalBill(double discountRate,List<Items> list)
	{
		double totalAmount=0;
		double sumGroceries=list.stream().filter(i->i.getItemType().equalsIgnoreCase("G")).collect(Collectors.summingDouble(i->i.getPrice()));
		double sumNonGroceries=list.stream().filter(i->i.getItemType().equalsIgnoreCase("NG")).collect(Collectors.summingDouble(i->i.getPrice()));
		totalAmount= sumNonGroceries+sumGroceries-(sumGroceries*discountRate);
		totalAmount=totalAmount-((Math.floor(totalAmount/100)*100)*0.05);
		return totalAmount;
	}

}
