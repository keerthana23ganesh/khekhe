package org.userDefintion;

public class Employee {
	public void search() throws EmployeeNotFoundException {

	int i=10;
	if (i==100) {
		System.out.println("valid emp");
	}else {
            throw new EmployeeNotFoundException();
            
}
}

public static void main(String[] args) throws Exception {
	Employee e=new Employee();
	e.search();
}
}
