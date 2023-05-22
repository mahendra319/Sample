package sample.qa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	
	static WebDriver driver;
	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total No of Links are: "+linkList.size());
		
//		for (WebElement ele : linkList) {
//			System.out.println(ele.getText());
//		}
//		
		
		//iterate using Iterator
//		
//		Iterator<WebElement> it =linkList.iterator();
//		
//		while(it.hasNext()) {
//			String urlText = it.next().getText();
//			System.out.println(urlText);
//		}
//		driver.close();
		
		for (int i=0; i<linkList.size();i++) {
			
			WebElement ele = linkList.get(i);
			String urlText = ele.getText();
			System.out.println(urlText);
			verifyLinks(urlText);
		}

	}





public static void verifyLinks(String urlString) {
	
	try {
		URL url = new URL(urlString);
		
		//Now we will be creating url connection and getting the response code
		HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
		httpUrlConnection.setConnectTimeout(5000);
		httpUrlConnection.connect();
		
		if(httpUrlConnection.getResponseCode()>=400) {
			
			System.out.println(urlString+" _ "+httpUrlConnection.getResponseMessage()+" is Broken Link");
		}
		//Fetching and Printing the response code obtained
		else {
			System.out.println(urlString+" _ "+httpUrlConnection.getResponseMessage());
		}
		
		
		
	} catch (MalformedURLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
}






}







