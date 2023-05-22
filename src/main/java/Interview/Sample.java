package Interview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Sample {
	
	
	WebDriver driver;
	
@Test
public void navigateToConcept() {
	
	driver.navigate().to("https://www.google.com");
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	
	Alert alt =driver.switchTo().alert();
	
	
}
	
}
