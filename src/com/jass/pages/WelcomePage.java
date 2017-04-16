package com.jass.pages;


import com.jass.common.CommonMethods;

public class WelcomePage {
 public CommonMethods CM;
	    
 public void clickLogyourselfLink(){
		CM=new CommonMethods();
		CM.click("//*[@id='bodyContent']/div/div[1]/a[1]/u");
		//CM.click(".//*[@id='tdb4']/span[2]");

	}
	
}
