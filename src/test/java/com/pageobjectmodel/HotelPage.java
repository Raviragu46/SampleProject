package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class HotelPage extends BaseClass{
	
	public HotelPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id = "continue")
	private WebElement conBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getConBtn() {
		return conBtn;
	}
	
	

}
