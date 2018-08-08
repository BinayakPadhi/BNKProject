package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//I am using PageFactory
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type = 'submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement Logo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean ValidateCRMLogo()
	{
		return Logo.isDisplayed();
	}
	
	public HomePage Login(String UserNm, String Pwd) throws InterruptedException
	{
		username.sendKeys(UserNm);
		password.sendKeys(Pwd);
		Thread.sleep(5000);
		LoginBtn.click();
		
		return new HomePage();
	}
}
