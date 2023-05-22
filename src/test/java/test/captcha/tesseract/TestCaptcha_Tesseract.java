package test.captcha.tesseract;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TestCaptcha_Tesseract {

	static WebDriver driver;
	
	
	//Tesseract is a OCR engine, to helps us reading from the images. Tesseract OCR is a Optical Character Regcoginition Engine
	//tess4j - A java native access wrapper for Tesseract OCR API
	//https://www.youtube.com/watch?v=cDlxVfETBSQ
	//https://www.youtube.com/watch?v=CCcGPLaaU10
	
	public static void main(String[] args) {

		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		
		WebElement captchaImg = driver.findElement(By.xpath("(//div[@id='nlpImgContainer']//img)[2]"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		File src = captchaImg.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"\\CapchaImages\\captcha.png";
		
		
		try {
			FileHandler.copy(src, new File(path));
			Thread.sleep(3000);
			
			
			ITesseract img = new Tesseract();
			
			//OCR - Optical Character Recognition
			String text = img.doOCR(new File(path));
			
			System.out.println("img OCR done");
			System.out.println(text);
			
			String captcha = text.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(captcha);
			
			driver.findElement(By.id("nlpAnswer")).sendKeys(captcha);
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (TesseractException e) {
			e.printStackTrace();
		}
		
	}

}
