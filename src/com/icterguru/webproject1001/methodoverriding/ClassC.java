package com.icterguru.webproject1001.methodoverriding;

public class ClassC extends ClassB {
	public void add(int a,int b) {
		System.out.println("The result is; " +(a+b));
	}
	public static void main(String[] args) {
		ClassA ob1 =new ClassA();//Grandparent
		ob1.add(22, 28);
		ClassB ob2 =new ClassB();//parent
		ob2.add(30, 60);//Method Overriding
		ClassC ob3= new ClassC(); //Child
		ob3.add(70, 13);//Method Overriding
	}



}