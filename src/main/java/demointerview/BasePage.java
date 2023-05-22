package demointerview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	WebDriver driver;
	
	Properties prop;
	
	public WebDriver init_Webdriver(String browserName) {
		
		//String browserName = '';
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browserName.equalsIgnoreCase("safari")) {
			
			driver =new SafariDriver();
		}else {
			
			System.out.println("Please check the browser name and pass correct browser");
		}
			
		return driver;
	}
	
	public Properties init_prop(String env) {
		
//		String env=null;
//		env = System.getProperty("environment");
		
		String fPath = "";
		prop = new Properties();
		
		switch (env) {
		case "QA":
			fPath = "";
			break;
		case "dev":
			fPath="";
			break;
		case "prod":
			fPath="";
			break;
		default:
			System.out.println("Please check the environment");
			break;
		}
		
		
		
		try {
			FileInputStream fis = new FileInputStream(fPath);
			prop.load(fis);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
	
	public String getScreenshot() {
		
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String fPath = "";
		
		File destination = new File(fPath);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fPath;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

}
