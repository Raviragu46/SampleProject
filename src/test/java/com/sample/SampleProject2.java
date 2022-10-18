package com.sample;

import java.util.Date;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pageobjectmodel.LoginPage;

public class SampleProject2 extends BaseClass {
	
	@DataProvider(name = "testData")
	private String[][] dataProvider() {
		
		String[][] s = {{"greens01@gmail.com","65532846"}, {"greens02@gmail.com","9282938"}, {"greens03@gmail.com","64564566"}};
		
		return s;
	}
	@Test(dataProvider = "testData")
	private void test1(String email, String password) {
		
		browserLaunch("chrome");
		launchUrl("https://www.facebook.com/login/");
		
		LoginPage l = new LoginPage();
		
		WebElement username = l.getUserName();
	    typeText(username, email);
	    
	    WebElement pass = l.getPassword();
	    typeText(pass,password);
		
	}


}
