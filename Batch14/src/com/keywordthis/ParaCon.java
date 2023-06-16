package com.keywordthis;

public class ParaCon {
int a;
int b;

public ParaCon(int c,int b) {
	a=c;
	this.b=a;
}
void add() {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		
		ParaCon p=new  ParaCon(10, 5);
		p.add();
	}

}
