package org.userDefintion;

public class EmployeeNotFoundException extends Exception{
	@Override
	public String getMessage() 
	{
		return "not found";
	}

	

}
