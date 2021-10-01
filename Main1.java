package com.bankmanagement.main;
import com.bankmanagement.pojo.*;
public class Main1 {
	public static void main(String[] args) {
		Address addobject = new Address();
		addobject.setFlatNo("p-311");
		System.out.println(addobject.getFlatNo());
		addobject.setLineone("K.G center point");
		System.out.println(addobject.getLineone());
		addobject.setLinetwo("100B");
		System.out.println(addobject.getLinetwo());
		addobject.setStreetName("palanjur road");
		System.out.println(addobject.getStreetName());
		addobject.setDistrict("kancheepuram");
		System.out.println(addobject.getDistrict());
		addobject.setPincode("6021170");
		System.out.println(addobject.getPincode());
		addobject.setLandmark("Next to st.john's residential school");
		System.out.println(addobject.getLandmark());
		
	}

}
