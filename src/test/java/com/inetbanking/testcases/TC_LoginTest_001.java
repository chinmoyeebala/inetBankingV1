package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void LoginTest() throws IOException{
	
	logger.info("URL is open");
	//Thread.sleep(20000);
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Entered username");
	lp.setPassword(password);
	logger.info("Entered password");
	lp.clickSubmit();
	
	logger.info("Entered Login button");
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage123")){
		Assert.assertTrue(true);
		logger.info("LoginTest passed");
	}
	else{
		captureScreen(driver,"LoginTest");
		Assert.assertTrue(false);
		logger.info("LoginTest failed");
	
	}
  }
}

