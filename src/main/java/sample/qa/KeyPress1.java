package sample.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyPress1 {

	static WebDriver driver;
	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		
			//Keys is an ENUM in Selenium - ENUM is just like class can have different methods and attributes, 
			//but the constants in ENUM by default static , final and public 
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(3000);
			
			driver.findElement(By.id("txtUsername")).sendKeys(Keys.RETURN);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.ARROW_RIGHT);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.BACK_SPACE);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.CONTROL);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.LEFT_CONTROL);
	
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.ALT);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.DELETE);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.CANCEL);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.SHIFT);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.LEFT_SHIFT);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.SPACE);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.SEPARATOR);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.TAB);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.EQUALS);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.HOME);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.END);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.PAUSE);
		driver.findElement(By.id("txtUsername")).sendKeys(Keys.ADD);
		
		WebElement uName = driver.findElement(By.id("txtUsername"));
		
		uName.sendKeys(Keys.NUMPAD0);
		uName.sendKeys(Keys.NUMPAD1);
		uName.sendKeys(Keys.NUMPAD2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
