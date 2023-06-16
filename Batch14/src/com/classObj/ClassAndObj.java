package com.classObj;

public class ClassAndObj {

	int a=5;
	static int b=5;
	ClassAndObj z=new ClassAndObj();
	public void m1() {
		int b=10;
		System.out.println(a);
		m1();
	}
	static void m2() {
		System.out.println("Static");
//ClassAndObj c=new ClassAndObj();
	
	}
	
	
	public static void main(String[] args) {
		
		ClassAndObj c=new ClassAndObj();
		
		System.out.println("Before :"+b);
		b=10;
		System.out.println("After :"+b);
		c.a=10;
		System.out.println("Instance Variable : "+ c.a);
		c.m1();
		m2();
		

	}

}
