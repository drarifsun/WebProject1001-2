package com.icterguru.webproject1001.java_basic;


public class VariablesJava {
	//EXAMPLE OF ACCESSING STATIC AND NON STATIC METHOD AND VARIABLES:
		
			static int x = 10;
			static int y = 20;// Static variables
			int z = 30;
			int m = 34; // Non Static variables

			public static void add() {// Static method
				System.out.println("The addition of a and b is:" + (x + y));

			}

			public void add2() {// Static method
				System.out.println("The addition of a and b is:" + (z + m));
			}

			public static void main(String[] args) {
				System.out.println(VariablesJava.x);// Accessing static class members
				System.out.println(VariablesJava.y);// Accessing static class members
				VariablesJava.add();// Accessing static method

				// Accessing non static class members and method.
				VariablesJava obj = new VariablesJava();
				System.out.println(obj.z);
				System.out.println(obj.m);
				obj.add2();

			}
		




		}



