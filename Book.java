package com.library;

public class Book {
	private String title;
	private String author;
	private double price;
	public void setBookDetails(String t, String a, double p) {
		title=t;
		author=a;
		price=p;

	}
	public String getBookDetails(){
		return "Book Title:" + title+ "\nAuthor:"+ author+ "\nprice:" +price;
		
	}

}
