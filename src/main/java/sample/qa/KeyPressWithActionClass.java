package sample.qa;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyPressWithActionClass {

	
	static WebDriver driver;
	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT)
		.sendKeys(driver.findElement(By.id("txtUsername")),"a").keyUp(Keys.SHIFT).build().perform();
		
		
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Mr.Peter Haynes");
		driver.findElement(By.id("userEmail")).sendKeys("PeterHaynes@toolsqa.com");
		driver.findElement(By.id("currentAddress")).sendKeys("3 School Lane London EC71 9GO");
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		action.sendKeys(Keys.TAB).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
