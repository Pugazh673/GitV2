package com.keywordthis;

public class Method {

	final int a = 5;
	int b;

	public void m1() {

		System.out.println(a + b);
	}

	public void m1(int a) {
		System.out.println(a + b);
	}

	void m1(int b, int a) {

	}

	void m1(String a) {

	}

	public Method() {

	}

	public Method(int a) {

	}

	public Method(int a, String b) {

	}

	public int m2() {
	
		b = 20;
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {

		Method m = new Method();
		m.m1();
		System.out.println(m.b);
		int c = m.m2();
		m.m1(c);

	}

}
