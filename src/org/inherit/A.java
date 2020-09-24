package org.inherit;

public class A {
	static int a=10,b=20;
	static int c=0;
	
	public static void saving() {
		c=a+b;
		System.out.println("Class=\\t A\\t Saving");
	}
	
	
	public void fixed() {
		c=a+b;
		System.out.println("Class=\\t A\\t Fixed");
	}
	
	public void current() {
		System.out.println("Class=\\t A\\t Current");
	}
	
}
