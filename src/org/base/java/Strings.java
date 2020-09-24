package org.base.java;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] split = s.split(" ");
		for(int i=0;i<=split.length-1;i++) {
			String string = split[i];
			char charAt = string.charAt(0);
			String substring = string.substring(1);
			String rev=" ";
				rev=rev+Character.toUpperCase(charAt)+substring;
				System.out.print(rev);
			
			
		}
	}

}
