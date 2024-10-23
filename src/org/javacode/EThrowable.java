package org.javacode;

public class EThrowable {
	//create this class 1st then go for creating the EmployeeNotFondException and throw..
	public static void main(String[] args) throws EmployeeNotFondException {	
	String s="120";
	if (s.equals("231")) {
		System.out.println("employee found");
		
	}else {
		throw new EmployeeNotFondException();
	}
		
	

	}
}
