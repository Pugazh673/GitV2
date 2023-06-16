package com.inher.multile.sub;

import com.inher.multile.ClassA;
import com.inher.multile.ClassB;

public class ClassC extends ClassB {

	
	public void m2() {
		System.out.println("Class C");
	}
public ClassC() {
	super();
	System.out.println("Class c con");
}
	
	public static void main(String [] arg) {
		ClassC c=new ClassC();
		ClassB b=new ClassC();
		c.m2();
		c.m1();
		b.m1();
		c.a=5;
		
	}
	
}
