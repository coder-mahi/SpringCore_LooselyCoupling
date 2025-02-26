package com.beans;

public class DTDC implements Courier{
	public DTDC(){
		System.out.println("DTDC : 0 param-constructor");
	}
	@Override
	public final String deliver(int orderId){
		return "\nDTDC is ready do deliver products of : "+orderId;
	}

}
