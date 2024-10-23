package singleton;

public class Employee {
public static Employee e;
public Employee() {
	System.out.println("Default constructor");
	}
public static Employee getObjectInstance() {
	if(e==null) {
		e=new Employee();
	}
	
	return e;

}
public void getName() {
System.out.println("kiki");

}
public void getId() {
System.out.println("123");
}
}
