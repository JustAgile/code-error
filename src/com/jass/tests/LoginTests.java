package com.jass.tests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;



import com.jass.common.CommonMethods;
import com.jass.pages.LogOffPage;
import com.jass.pages.SignInPage;
import com.jass.pages.WelcomePage;

public class LoginTests  {
	String sURL="http://107.170.213.234/catalog/";
	String ExpectedText = "Welcome To iBusiness";
	public CommonMethods CM;
	public WelcomePage WP;
	public SignInPage SI;
	public LogOffPage LP;
	
	@BeforeMethod
	public void setUp(){
	    
		CM=new CommonMethods();
		CM.openBrowser("Firefox");
		CM.openURL(sURL);
		
	}
		
	@AfterMethod
	public void tearDown(){
		CM.closeBrowser();
	}
	
	@Test
	public void testcase(){
		WP=new WelcomePage();
		WP.clickLogyourselfLink();
		SI=new SignInPage();
		SI.Login("ecalix@test.com","test123");
		CM.verifyText(ExpectedText);
	    LP=new LogOffPage();
		LP.clickLogOff();
	}
	
	}

