package UserDefintion;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sample {
public static void main(String[] args) {
	

	Map<Integer, Employee> mp=new LinkedHashMap<Integer, Employee>();
	
	Employee e1= new Employee();
	e1.setEmpId(10);
	e1.setEmpName("bala");
	
	Employee e2= new Employee();
	e2.setEmpId(20);
	e2.setEmpName("arun");
	mp.put(1, e1);
	mp.put(2, e2);
	
Set<Entry<Integer, Employee>> es = mp.entrySet();
for (Entry<Integer, Employee> x : es) {
	System.out.println(x.getKey()+"==>employee info");
	System.out.println(x.getValue().getEmpId());
	System.out.println(x.getValue().getEmpName());
	
}
	
	
}
}