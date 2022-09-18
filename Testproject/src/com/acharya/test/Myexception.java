package com.acharya.test;

public class Myexception {

	public static void main(String[] args) {
		try 
        {
            throw new NullPointerException ("Hello");
        }
        catch(ArithmeticException e) 
        {
            System.out.print("B");        	
        }
	}

}
