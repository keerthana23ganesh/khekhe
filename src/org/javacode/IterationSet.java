package org.javacode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationSet {
	public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(10);
	
	System.out.println(li);
	for (int i = 0; i < li.size(); i++) {
		System.out.println(i);
		
	}
	for (Integer integer : li) {
		System.out.println(integer);
	}
	}
	

}
