package com.trellis.energy.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JavaQuestions {

	/*
	 * Display numeric value from given Alpha Numeric string
	 */
	@Test
	public void getNumericFromAlphaNumeric() {
		
		String str = "Your transaction number is: 062221";
		
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		System.out.println(str.substring(str.indexOf("is")+3).trim());
	}
	
	/*
	 *  Dispaly numeric value from Alpha Numeric string using Pattern and Matcher Class
	 */
	@Test
	public void getNumericFromAlphaNumericUsingPatternAndMatcherClass(){
		
		String str = "Your transaction number is: 062221";
		
		Pattern p = Pattern.compile("\\d+");
		
		Matcher m = p.matcher(str);
		
		while(m.find()){
			
			System.out.println(m.group());
		}
		
		
	}
	
	
	@Test

	public void uqiueCharFromString() {
		
		String str ="GeeksForGeeks";
		
		for(int i=0; i<str.length();i++) {
			
			int flag=0;
			
			for(int j=0;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println(str.charAt(i));
			}
		}
	}
	
	
	
	
	
	//Reverse of String
	
	@Test
	public void reverString() {
		
		String s = "Houston";
		int i =0;
		int j =s.length()-1;
		
		char [] rString = new char[j+1];
		
		if(i<j) {
			
			rString[i]=s.charAt(j);
			rString[j] = s.charAt(i);
			i++;
			j--;
			
			
		}
		
		System.out.println(String.valueOf(rString));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
