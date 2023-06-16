package com.keywordthis;

public class Keywords {

	public  int a;
	int b;

	public Keywords() {
		System.out.println("Default");
	}

	void add() {
		a=5;
		b=5;
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		Keywords k=new Keywords();
		k.add();
		
	}

}
