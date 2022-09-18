package com.acharya.test;

class A {

	private void printName() {
		System.out.println("Value A");
	}
}
class B extends A {
	void  printName() {
		System.out.println("Name-B");
	}
}
public class Test{
	public static void main(String[]agrs) {
		B b = new B();
		b.printName();
	}
}