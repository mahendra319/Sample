package com.hcl.interview;

import org.testng.annotations.Test;

public class InterviewQuestions {
	
		

	//1. Reverse String
	
	
@Test
public void reverseString() {
	String str = "Today is a Holiday";
	
	int i=0;
	int j = str.length()-1;
	char [] revString = new char[j+1];
	
	
	while(i<j) {
		
		revString[i]= str.charAt(j);
		revString[j] = str.charAt(i);
		
		i++;
		j--;
	}
	
	System.out.println(String.valueOf(revString));
	
	}

	//reverse string using java StringBuilder class in-built method reverse()
@Test
	public void reverseStringUsingStringBuilder() {
	
		String str = "Houston";
		
		StringBuilder sb = new StringBuilder();
			//append string into string builder sb
		sb.append(str);
			//reverse string builder sb
		sb.reverse();
			//print reverse string
		System.out.println(sb);
}
	

@Test
	public void reverseStringUsingStringBuffer() {
	
		String str = "Texas";
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
}

@Test
	public void numberOfOccurancesOfCharFromGivenString() {
	
		String str = "Today is Monday";
		int res =0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a') {
				
				res=res+1;
			}
		}
		
		System.out.println(res);
	
}
}
