package com.myclass;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Family implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1140589584921368604L;
	private String FName="";
	private String LName="";
	private String DOB="";
	private int Age=0;

	public Family() {
		// TODO Auto-generated constructor stub
	}
	public Family(String fName, String lName, String dob) {
		setFName(fName);
		setLName(LName);
		setDOB(dob);
		
		// TODO Auto-generated constructor stub
	}
	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getAge(String DOB) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		LocalDate localDOB = LocalDate.parse(DOB, formatter);
		//SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
		int iAge = Period.between(localDOB, LocalDate.now()).getYears();
		//Age = 
		return iAge;
	}

	public int getAge() {
		return Age;
	}

	/*public void setAge(int age) {
		Age = age;
	}*/

}
