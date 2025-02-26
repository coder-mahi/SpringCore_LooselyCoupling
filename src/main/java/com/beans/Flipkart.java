package com.beans;
import java.util.Random;
public class Flipkart {
	private Courier courier;
	public Flipkart(){
		System.out.println("Flipkart : 0 param-constructor");
	}
	
	//setter injection
	public void setCourier(Courier courier){
		System.out.println("Flipkart: setCourier()--> setter injection called");
		this.courier = courier;
	}
	public String purchase(String items[]){
		//generate order id
		Random random = new Random();
		int orderId = random.nextInt(700000);
	
		//deliver order
		String status = courier.deliver(orderId);
		
		return status+", Bill amt for order id :"+orderId+" is 7000";
	}
}