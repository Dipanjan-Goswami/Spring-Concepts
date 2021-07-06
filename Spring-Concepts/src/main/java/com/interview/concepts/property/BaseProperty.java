package com.interview.concepts.property;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseProperty implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	List<Property> listOfProperty = new ArrayList<Property>();

	public List<Property> getListOfProperty() {
		return listOfProperty;
	}

	public void setListOfProperty(List<Property> listOfProperty) {
		this.listOfProperty = listOfProperty;
	}
	
}
