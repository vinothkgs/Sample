package org.base.java;

import java.util.Scanner;

public class Amstrong {
public static void main(String[] args) {
	int a,c=0,temp;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	temp=n;
	while(n>0) {
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
	}
	if(c==temp) {
		System.out.println("the given number is Amstrong");
	}
	else
		System.out.println("the given number is not a amstrong");
	
	
}
}
