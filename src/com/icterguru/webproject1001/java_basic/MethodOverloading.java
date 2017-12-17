package com.icterguru.webproject1001.java_basic;

public class MethodOverloading {
	
	//Method Overloading Concept

		public void add(int x, int y) {
			System.out.println(x + y);

		}

		public void add(int x, int y, int z) {// Method Overloading with different number of arguments.
			System.out.println(x + y + z);
		}

		public void add(double x, double y) {// Method Overloading with different types of arguments.
			System.out.println(x + y);
		}

		public static void main(String[] args) {

			MethodOverloading MD = new MethodOverloading();
			MD.add(30, 40);
			MD.add(30, 90, 45);
			MD.add(4.5, 8.75);
		}
	}




