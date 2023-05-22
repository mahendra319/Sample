package demointerview;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelPrac {

	
	WebDriver driver;
	
	
	@Test
	public void demoTest() {
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--incognito");
		// this statement will solve the issue for Selenium 4.x
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://www.gmail.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://amazon.com");
		
		//driver.close();
		
		
//		//title 
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.titleIs(""));
//			//alert 
//		wait.until(ExpectedConditions.alertIsPresent());
//			//url
//		wait.until(ExpectedConditions.urlContains(""));
//		
//		List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("")));
		
	Set<String> wHandles=driver.getWindowHandles();
	System.out.println(wHandles.size());
	
	Iterator<String> it =wHandles.iterator();
		String pHandle = it.next();
		System.out.println("Parent window handle: "+pHandle);
		
		String cHandle = it.next();
		System.out.println("Child window Handle: "+cHandle);
		
		driver.switchTo().window(pHandle);
		driver.get("https://google.com");
		
		
		
		
		
		
		
		
		
		
	}
}
