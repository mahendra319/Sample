package com.trellis.energy.interview;


/*
 * Print Fibonacci series with Recursion
 */
public class PrintFibonacciSeries {

	static int n1=0;
	static int n2=1;
	static int n3=0;
	public static void main(String[] args) {
		
		int count =10;
		
		System.out.println(n1+"\n"+n2);
		
		printFS(count-2);

	}
	
	
	public static void printFS(int count) {
		if(count>0) {
			
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.println(" "+n3);
			printFS(count-1);
		}
	}

}
