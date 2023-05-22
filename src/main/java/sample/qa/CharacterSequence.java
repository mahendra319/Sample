package sample.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CharacterSequence {

	static WebDriver driver;
	public static void main(String[] args) {

		
		//https://www.youtube.com/watch?v=qM9VSDjzZVw
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement uid = driver.findElement(By.id("txtUsername"));
		WebElement pd = driver.findElement(By.id("txtPassword"));
		
		//using StringBuilder - is mutable
		StringBuilder uName = new StringBuilder()
		.append("Admin")
		.append("@")
		.append("gmail.com");
		
		uid.sendKeys(uName, Keys.TAB);
		
				
		//String Buffer - is mutable
		StringBuffer pwd = new StringBuffer();
		pwd.append("admin")
		.append("@")
		.append("123");
		
		pd.sendKeys(pwd);
		
	}

}
