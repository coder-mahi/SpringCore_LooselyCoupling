package com.beans;

public class BlueDart implements Courier {
	public BlueDart(){
		System.out.println("BlueDart : 0 param-constructor");
	}
	@Override
	public final String deliver(int orderId){
		return "\nBlueDart is ready do deliver products of : "+orderId;
	}
}
