package org.base.java;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String rev = "";
		System.out.println("The Given Text is\n"+a);
		System.out.println("**************************************");
		
		
		for(int i=a.length()-1;i>=0;i--) {
			char c = a.charAt(i);
			rev=rev+c;	
		}
		
		if(rev.equals(a)) {
			System.out.println("Paliindrome for the  Given Text is\n"+rev);
		}
		else {
			System.out.println("The Given string is not a Palindrome\n"+rev);
		}
		
		System.out.println("**************************************");
	}

}
