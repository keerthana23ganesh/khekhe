package singleton;

public class Sample {
	
	public static void main(String[] args) {
		
		Employee e = Employee.getObjectInstance();
		e.getName();
		e.getId();
		System.out.println(e);
		
		Employee d1 = Employee.getObjectInstance();
		e.getName();
		e.getId();
		System.out.println(e);
		
	}

}
