package org.javacode;

public class Returntype {
public int test(int i) {
	if (i==10) {
		return 100;
	}
	return 0;
}
public static void main(String[] args) {
	Returntype returntype=new Returntype();
	int t = returntype.test(10);
	System.out.println(t);
}
}
