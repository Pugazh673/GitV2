package com.callby;

public class CallbyReferance {

	void modify(Student s) {
		s.name="Raju";
	}
	
	
	
	public static void main(String[] args) {
	//	Student s=new Student("Raja");
		Student s=new Student();
s.name="Ravi";
System.out.println("Before Calling :"+ s.name);
new CallbyReferance().modify(s);
System.out.println("After Calling :"+ s.name);

	}

}
 class Student{
	 String name;
	 
	 public Student() {
	
	}
	 Student(String name){
		 this.name=name;
	 }
}