package com.acharya.test;

public class Exception_handling {

	public static void main(String[] args) {
      try {
    	    int a,b;
    	    b = 0;
    	    a = 5/b;
    	    System.out.println("A");
      }
      catch(ArithmeticException e) {
    	  System.out.println("B");
      }
	}
}
