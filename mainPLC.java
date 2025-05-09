package com.product;

public class mainPLC {
	public static void main() {
		productBLC obj =new productBLC();
		obj.setproductDetails("laptop",501,75000.0);
		obj.getproductDetails() ;
	}

}
