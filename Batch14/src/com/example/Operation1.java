package com.example;

public class Operation1 {
	int a;
	public static void main (String args[]) {
		Operation1 operation = new Operation1();
		int a=operation.a=500;
		System.out.println("Calling Before :"+a);
		operation.method1(500);
		System.out.println("After Calling :"+a);
		
	}
	public void method1(int a) {
		a=90;
		//System.out.println("Inside calling :"+a);
	}

}
