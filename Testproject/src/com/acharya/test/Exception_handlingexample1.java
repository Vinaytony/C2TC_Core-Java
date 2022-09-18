package com.acharya.test;

public class Exception_handlingexample1 {

	public static void main(String[] args) {
       try {
    	    int a = arg.length;
    	    int b = 10/a;
    	    System.out.println("a");
    	    try {
    	    	if( a == 1 )
    	    	a = a/a-a;
    	    	if (a == 2)
    	    	{
    	    		int[]c = {1};
    	    		c[8] = 9;
    	    	}
    	    }
    	    catch (ArrayIndexOutOfBoundsException e)
    	    {
    	    	System.out.println("TypeA");
    	    }
    	    catch (ArithmeticException e)
    	    {
    	    	System.out.println("TypeB");
    	    }
          }
	}
}
