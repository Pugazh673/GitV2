package com.callby;

public class CallbyValue {

	public void modify(int value) {
		value=20;
		System.out.println("inside Method : "+value);
		
	}
	
	public static void main(String[] args) {
	
		int x=5;
		System.out.println("Before calling : "+x);
		new CallbyValue().modify(x);
		
		System.out.println("After Calling : "+x);
	}

}
