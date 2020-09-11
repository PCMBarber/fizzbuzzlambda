package com.qa.lambda;

import java.util.ArrayList;

public class LambdaExpressions {
	
	interface FuncInterface {
        void operation(int a);
    }
	
    private void operate(int a, FuncInterface funcObj) {
        funcObj.operation(a);
    }
    
    public static void main(String[] args) {
        FuncInterface fizz = (int x) -> {if (x % 3 == 0) System.out.print(" Fizz");};
        FuncInterface buzz = (int x) -> {if (x % 5 == 0) System.out.print(" Buzz");};

        LambdaExpressions lambda = new LambdaExpressions();
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
	    for(int i = 0; i <= 200; i++) {
	    	arrayList.add(i);
	    }
        
	    for (int a : arrayList) {
	    	System.out.print(a);
	    	lambda.operate(a, fizz);
	    	lambda.operate(a, buzz);
	    	System.out.println();
	    }
    }
}
