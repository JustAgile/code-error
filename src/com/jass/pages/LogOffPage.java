package com.jass.pages;

import com.jass.common.CommonMethods;

public class LogOffPage {
	
	public CommonMethods CM; 
	
	public void clickLogOff(){
		CM= new CommonMethods();
		
		CM.click("//*[@id='tdb4']/span");
		System.out.println("click log off");
	}
	
	
}
