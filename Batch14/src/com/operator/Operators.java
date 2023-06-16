package com.operator;

public class Operators {

	public void unary() {
		int a=5;
		 int b=  ++a;
		 int c=a;
		 String k="k";
		System.out.println(b);
		
		System.out.println(a);
		
		int q =5;
		q+=a;
		System.out.println(q);
		System.out.println( -a++ + ++b);
		a=5;
		b=6;
		String f="is True";
		String e="is False";
		String d= (b<a)?f:e;
		System.out.println(d);
		
		int h= 5;
		
		
		int z=a |b;
		System.out.println("AND GATE :"+z);
		
		
		System.out.println(5<<3);
		
		
	int l=	(58==5)? 1:3;
	System.out.println(l);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(5+5);
		System.out.println();
		Operators o=new Operators();
		o.unary();
		

	}

}
