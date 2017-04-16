package capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookScreenshot {

	@Test
	public void capturescreenShot() throws IOException
	{
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vinaykumars1209@gmail.com");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File source=ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(source, new File("./Screenshots/facebook.png"));
	
	System.out.println("screenshot taken");
	
	driver.quit();
			
	}
	
}
