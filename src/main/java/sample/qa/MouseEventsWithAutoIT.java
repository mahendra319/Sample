package sample.qa;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEventsWithAutoIT {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		driver.get("https://toolsqa.com/automation-practice-form");

	    driver.findElement(By.id("photo")).click();
	    try {
			Runtime.getRuntime().exec("");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
