package com.callby;

public class TwoDimArr {

	public void m1(int a) {
		
		
		

		
	}
	
	public static void main(String[] args) {
		TwoDimArr t=new TwoDimArr();
		t.m1(0);
		
		int [][]data=new  int [2][2];
		
		data[0][0]=1;
		data[0][1]=2;
		data[1][0]=3;
		data[1][1]=4;
		
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				System.out.print(data[i][j]);
				System.out.print("\t");
			}
			System.out.println();
			
			int a=5;
			
			String d=String.valueOf(a);
			System.out.println("String "+d);
			int c=Integer.valueOf(d);
			System.out.println("Int "+c);
			
		}
		

	}

}
