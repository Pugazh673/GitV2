package com.callby;

public class Ref {
	String name="Ravi";
	
	void m1(Ref obj) {
		System.out.println("Before change inside method :"+obj.name);
		obj.name="Raju";
	}
	
	public static void main(String[] args) {
		Ref r=new Ref();
		System.out.println("Before change outside method : "+r.name);
		r.m1(r);
		System.out.println("After change outside method : "+r.name);
	}

}
