package org.base.java;

import java.util.Scanner;

public class Febonaci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1;
		int f=sc.nextInt();
		for(int i=0;i<=f;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	
	}

}
