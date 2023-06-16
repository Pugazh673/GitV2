package com.test;

public class First {

 static	int a=5; //Static 
	int b=20;//instance 
	void m1() {
		int b=6;//local
System.out.println("Local variable :"+ b);
	}
	void m2() {
		System.out.println("Instance Variable : "+ a);
		System.out.println("Instance Variable : "+ b);
	}
	 static void m3() {
		 System.out.println("Static variable :"+a);
	 }
	
	
	public static void main(String args[]) {
		System.out.println("Start");
		First f=new First();
		f.m1();
		f.m2();
		First.m3();
		int a;
		
		
	}
	
}
