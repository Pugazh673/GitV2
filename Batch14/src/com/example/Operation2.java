package com.example;

public class Operation2{  
	 int data;  
	  
	 void change(Operation2 op){  
	 this.data=op.data+100;  //changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
	   Operation2 op=new Operation2(); 
	   Operation2 opp=new Operation2(); 
	  op.data=90;
	   System.out.println("before change "+op.data);  
	   op.change(opp);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  