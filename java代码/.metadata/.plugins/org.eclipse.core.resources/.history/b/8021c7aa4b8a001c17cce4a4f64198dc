package com.bjpowernode.javase.test006;

public class Exercise {
	
	public static void main(String[] args) {
		
		int retValue = calculatePrimeNumber(1,100);
		System.out.println(retValue);

	}
	
	public static int calculatePrimeNumber(int a,int b) {
		if(a==1) {
			a = 2;
		}
		int m = 0;
		for(int i=a; i<=b; i++) {
			int n = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					n = 1;
					break;
				}
			}
			if(n==0){
				m += i;
			}
		}
		return m;
	}
}	
