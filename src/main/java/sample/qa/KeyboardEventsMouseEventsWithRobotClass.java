package sample.qa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsMouseEventsWithRobotClass {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/keyboard-events");
		
		// This will click on Browse button
				WebElement webElement = driver.findElement(By.id("browseFile"));		
				//click  Browse button 
				webElement.sendKeys(Keys.ENTER);
				
				//Create object of Robot class
				Robot robot = new Robot();
				//Code to Enter D1.txt 
				//Press Shify key 
				robot.keyPress(KeyEvent.VK_SHIFT);
				//Press d , it gets typed as upper case D as Shift key is pressed
				robot.keyPress(KeyEvent.VK_D);
				//Release SHIFT key to release upper case effect
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_1);
				robot.keyPress(KeyEvent.VK_PERIOD);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyPress(KeyEvent.VK_X);
				robot.keyPress(KeyEvent.VK_T);
				
				//Press ENTER to close the popup
		        robot.keyPress(KeyEvent.VK_ENTER);  

		        //Wait for 1 sec
		        Thread.sleep(1000);
					 
				//This is just a verification part, accept alert
		        webElement = driver.findElement(By.id("uploadButton"));
				
				webElement.click();				 
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));		 
				Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());	       	 
				//Accept the Alert		 
				myAlert.accept();

				//Close the main window 
				driver.close();
		
	}

}
