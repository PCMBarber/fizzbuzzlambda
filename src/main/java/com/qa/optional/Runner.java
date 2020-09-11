package com.qa.optional;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
	    for(int i = 0; i <= 100; i++) {
	    	arrayList.add(i);
	    }
	    
	    arrayList.forEach(x -> {if (x % 2 == 0) System.out.println(x);});
	}
}
