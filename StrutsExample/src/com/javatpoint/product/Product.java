package com.javatpoint.product;

import java.util.ArrayList;
import java.util.List;

public class Product  {

	List<String> data=new ArrayList();
	
	public String execute() {
		data.add("1");
		data.add("2");
		data.add("3");
		
		return "success";
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	
}
