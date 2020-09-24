package org.base.java;

import java.util.Scanner;

public class ReverseNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a = sc.nextInt();
	int b=0;
	int rev,n=1;
	while(1>=0) {
		rev=a%10;
		n=a/10;
		b=b+rev;
		System.out.println(b);
	}
}
}
