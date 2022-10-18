package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookingPage extends BaseClass {
	
	public BookingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement fristName;
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cardNum;
	
	@FindBy(id = "cc_type")
	private WebElement cardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id = "book_now")
	private WebElement bookBtn;

	public WebElement getFristName() {
		return fristName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

}
