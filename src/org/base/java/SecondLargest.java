package org.base.java;

public class SecondLargest {
	public static void main(String[] args) {
		int []a= {2,1,5,6,4,9,7,8,3,17,14};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
							
				}
				
			}
		}
		
		for(int i=1;i<=a.length-10;i++) {
			System.out.println(a[i]);
		}
	}
}
