package com.interview.concepts.property;

import java.io.Serializable;

//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;

//@Component
//@ConfigurationProperties
public class Property implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int studentCapacity;
	private String schoolName;
	
	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getStudentCapacity() {
		return this.studentCapacity;
	}
	
	public String getSchoolName() {
		return this.schoolName;
	}
}
