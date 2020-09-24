package org.inherit;

import javax.swing.tree.FixedHeightLayoutCache;

public class B extends A {

	
	public static void saving() {
		System.out.println("Class=\t B\t Saving");

	}
	
	@Override
	public void fixed() {
		super.fixed();
		System.out.println("Class=\\t B\\t Fixed");
	}
	
	
	@Override
	public void current() {
		super.current();
		System.out.println("Class=\\t B\\t CUrrent");
	}
	
	public static void main(String[] args) {
		saving();
		B b=new B();
		b.fixed();
		b.current();
	}
}
