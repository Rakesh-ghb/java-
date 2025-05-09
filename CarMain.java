package com.car;

public class CarMain {
	public static void main(String[] args) {
		carBLC obj = new carBLC();
		obj.setCarDetails("Swift", "Marutil",600000.0);
		System.out.println(obj.getCarDetails());
	}
}
