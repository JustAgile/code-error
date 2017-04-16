package com.jass.pages;

import org.openqa.selenium.By;

import com.jass.common.CommonMethods;

public class SignInPage {
	
	public CommonMethods CM;

      public void Login(String Username, String PWD){
		CM=new CommonMethods();
        CM.sendvalue(".//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[1]/td[2]/input", Username);
		CM.sendvalue(".//*[@id='bodyContent']/div[2]/div/form/table/tbody/tr[2]/td[2]/input", PWD);
		CM.click(".//*[@id='tdb5']");
      			}
	
	public void clickSign(){
		CM.click(".//*[@id='tdb5']");
	}
	
}
