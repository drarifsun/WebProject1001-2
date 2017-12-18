package com.icterguru.webproject1001.java_basic;

public class Employee {
	
		public static void main(String args[]) {
			/* Create two objects using constructor */
			EmployeeTest empOne = new EmployeeTest("James Smith");
			EmployeeTest empTwo = new EmployeeTest("Mary Anne");
			// Invoking methods for each object created
			empOne.empAge(26);
			empOne.empDesignation("Senior Software Engineer");
			empOne.empSalary(10000);
			empOne.printEmployee();
			empTwo.empAge(21);
			empTwo.empDesignation("Software Engineer");
			empTwo.empSalary(5000);
			empTwo.printEmployee();
			System.out.println("Equal opportunity employer policy");
		}
	}


