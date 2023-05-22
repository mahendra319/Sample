package sample.qa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


// java.awt - AWT stands for Abstract Window ToolKit and it is an API to develop GUI or window based applications in java
public class OpenDeveloperToolFromBrowserWithKeyPress {

	static WebDriver driver;
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(co);
	
	
		//press control+Shift+i - it is to open developer tools from browser
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_I);
			
			
			//Release control+Shift+I
			
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
