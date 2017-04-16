package com.jass.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.jass.common.CommonMethods;

public class CreateAccountPage {
	private WebDriver driver;
	private CommonMethods CM;
	

	//private WebElement LogYourSelfLink;


	public void clickLogyourselflink(){
		CM=new CommonMethods();
		CM.click("//*[@id='bodyContent']/div/div[1]/a[1]/u");
		
	}
	
	
	

}
