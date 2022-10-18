package com.sample;

import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pageobjectmodel.BookingPage;
import com.pageobjectmodel.HotelPage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.SearchHotelPage;

public class SampleProject extends BaseClass {
	
		@BeforeClass
		private void beforeClass() {
			
			browserLaunch("chrome");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@AfterClass
		private void afterClass() {
			
			driver.close();
		}
		@BeforeMethod
		private void before() {
			
			Date d = new Date();
			System.out.println(d);
		}
        @AfterMethod
		private void after() {
			
			Date d = new Date();
			System.out.println(d);
		}
		@Test
		@Parameters({"email","password"})
		private void test(String email, String password) {
			
			launchUrl("https://www.facebook.com/login/");
			
			LoginPage l = new LoginPage();
			
			WebElement username = l.getUserName();
		    typeText(username, email);
		    
		    WebElement pass = l.getPassword();
		    typeText(pass, password);
		    
		    WebElement login = l.getLogin();
		    login.click();
		}
}
