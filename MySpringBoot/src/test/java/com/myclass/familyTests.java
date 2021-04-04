package com.myclass;

public class familyTests{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Family myFam= new Family("Anand", "Gopalan", "06/30/1974");
		int iage = myFam.getAge(myFam.getDOB());
		System.out.println("Age " + iage);
		//System.out.println("Age " + iage);
	}

}
