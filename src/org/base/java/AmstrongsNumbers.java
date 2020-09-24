package org.base.java;

import java.util.Scanner;

public class AmstrongsNumbers {
	public static void main(String[] args) {
		
		int a,temp,b;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("\tDiscription\t\t\tNumbers\tCompare To");
		for(int i=1;i<=n;i++) {
			int c=0;
		temp=i;
		b=i;
		
		while(b>0) {
			
			a=b%10;
			b=b/10;
			c=c+(a*a*a);
		}
		if(c==temp) {
			System.out.println("The Given Number is Amstrong\t\t"+temp+"\t"+c);
		}
		else
			System.out.println("The Given Number Is Not a Amstrong\t"+temp+"\t"+c);
		}	

}
	
}