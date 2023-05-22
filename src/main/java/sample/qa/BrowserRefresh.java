package sample.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserRefresh {

	
	
	
	static WebDriver driver;
	public static void main(String[] args) throws Exception {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//1 way refresh 
		driver.navigate().refresh();
		
		Thread.sleep(2000);
// 2 way refresh		
		driver.get(driver.getCurrentUrl());

		Thread.sleep(2000);
		
//3 way refresh
		
		driver.navigate().to(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		
//4 way send F5 key
		
		driver.findElement(By.name("username")).sendKeys(Keys.F5);
		Thread.sleep(2000);
//5 way using ASCII value 		
		
		driver.findElement(By.name("username")).sendKeys("\uE035");
	}

}
