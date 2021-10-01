package com.bankmanagement.main;

public class CustomerConstructor {
	
	CustomerConstructor(String name){
		System.out.println("Name: " +name);
		
	}
	CustomerConstructor(int age){
		System.out.println("Age: " +age);
		
	}
	CustomerConstructor(long id){
		System.out.println("Id: " +id);
		
	}


public static void main(String[] args) {
	
	CustomerConstructor custobject = new CustomerConstructor("vishnuvarthiny");
	CustomerConstructor custobject1 = new CustomerConstructor(20);
	CustomerConstructor custobject2 = new CustomerConstructor(114282367);
	
}
	
	
	
	
}
