package com.bankmanagement.main;
import com.bankmanagement.pojo.*;
public class Main {
	public static void main(String[] args) {
		Customer custobject = new Customer();
		
		custobject.setName("VishnuVarthiny");
		System.out.println(custobject.getName());
		
		custobject.setId(114282801);
		System.out.println(custobject.getId());
		
		custobject.setPhone("916382364551");
		System.out.println(custobject.getPhone());
		
		custobject.setDob("7-aug-2001");
		System.out.println(custobject.getDob());
		
		custobject.setGender("Female");
		System.out.println(custobject.getGender());
		
		custobject.setEmail("vishnuvarthiny@gamil.com");
		System.out.println(custobject.getEmail());
		
		custobject.setAddress();
		System.out.println(custobject.getAddress());
		
		
		
	}

}
