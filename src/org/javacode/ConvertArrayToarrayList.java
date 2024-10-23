package org.javacode;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToarrayList {
public static void main(String[] args) {
	String a[]= {"aa","bb","cc"};
	ArrayList<String> l=new ArrayList<String>(Arrays.asList(a));
	System.out.println(l);

	
}
}
