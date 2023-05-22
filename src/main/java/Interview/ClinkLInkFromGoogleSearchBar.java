package Interview;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClinkLInkFromGoogleSearchBar {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		
		//driver= new ChromiumDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		System.out.println(elements.size());
		
		for (WebElement ele : elements) {
			String text = ele.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("Selenium WebDriver")) {
				
				ele.click();
				break;
			}
		}
	}

}
