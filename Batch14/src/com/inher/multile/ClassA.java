package com.inher.multile;

import com.inher.multile.sub.ClassC;

public class ClassA {
public int a=20;
	
	public void m1() {
		System.out.println("This classA");
	}
	
	public ClassA() {
	System.out.println("Class A con");
	}
	public static void main(String [] arg) {
		//ClassC c=new ClassC();
		ClassA a=new ClassA();
		a.a=15;
		a.m1();
	}
}
