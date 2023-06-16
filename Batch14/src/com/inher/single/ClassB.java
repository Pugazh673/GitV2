package com.inher.single;

public class ClassB extends ClassA {
	int a;

	public ClassB() {

		System.out.println("Class B cons");
	}

	public void read() {
		int a = 5;
		super.a = 10;

	//	System.out.println("Value :" + super.a);
	}

	public void write() {
		add(15,5);
		super.add(15, 5);
		System.out.println("Write");
	}

	public void add(int a, int b) {
		
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {

		ClassB b = new ClassB();

		b.write();
		b.read();
		
		
	}

}
