package com.product;

public class productBLC {
	private String productName;
	private int productId;
	private double price;

public void setproductDetails(String name,int id, double prc) {
	productName=name;
	productId=id;
	price=prc;
}
public void getproductDetails() {
	System.out.println("productName:"+productName+"\nproductId:"+productId+"\nprice:"+price);
}
}
