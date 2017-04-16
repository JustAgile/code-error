package com.jass.common;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CommonMethods {
	
	public static WebDriver driver;

	public void openBrowser(String sBrowser){
		if (sBrowser.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bvina\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Opening FireFox");
		}
		
		else
		{
			System.out.println("Please open a browser Firefox");
			Assert.fail();
		}	 
	}
	
	public void openURL(String sURL){
		
		driver.get(sURL);
		System.out.println("Opening URL");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	
	public void closeBrowser(){
		driver.quit();
		System.out.println("close Browser");
	}
	
	public void verifyText(String expected){
		 try{
			 driver.findElement(By.xpath("//*[contains(text(),'"+ expected.trim() +"')]"));
			 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" verified");
			// return true;
		 }
		 catch(NoSuchElementException e){
			 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
			 Assert.fail("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
		     
		 }
		 
	 }
	
	
	public void click(String sXPATH){
		try{
			driver.findElement(By.xpath(sXPATH)).click();
			System.out.println(sXPATH+" clicked");
			 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}catch(Exception e){
			System.out.println(sXPATH+" not clicked");
			Assert.fail();
		}		
	}
	
	
	
	
	public void sendvalue(String SXPATH, String svalue){
		try{
			driver.findElement(By.xpath(SXPATH)).clear();
			//System.out.println("clear the field");
			driver.findElement(By.xpath(SXPATH)).sendKeys(svalue);
			System.out.println(svalue+" entered");
		}catch(Exception e){
			System.out.println(svalue+" not entered");
			Assert.fail();
		}
	}


		
	
	

}