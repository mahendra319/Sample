package com.ciginit.interveiw;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Cig_InterUI {

	
	WebDriver driver;
	/*
	 * WAP to remove duplicate values from a given strings / display unique values
	 */
//	public static void main(String[] args) {
//
//		String str = "cigniti";
//
//		for (int i = 0; i < str.length(); i++) {
//
//			int flag = 0;
//			//int count =0;
//
//			for (int j = 0; j < str.length(); j++) {
//
//				if (str.charAt(i) == str.charAt(j) && i!=j) {
//
//					flag = 1;
//					//count++;
//					break;
//				}
//
//			}
//			if (flag == 0) {
//
//				System.out.println(str.charAt(i));
//				//System.out.println(count);
//			}
//		}
//		
//		
//		
//	}
	
	@Test
	public void openNaveenAutomationOpenCart() {
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}