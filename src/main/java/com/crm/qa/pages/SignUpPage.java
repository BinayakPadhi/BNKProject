package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {
	
	@FindBy(xpath = "//font[contains(text(), 'Sign Up')]")
	WebElement signup;
	
	@FindBy(id="payment_plan_id")
	WebElement edition;
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(name="surname")
	WebElement SurName;
	
	@FindBy(name="email")
	WebElement EmailId;
	
	@FindBy(name="email_confirm")
	WebElement ConfEmailId;
	
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement PassWord;
	
	@FindBy(name="passwordconfirm")
	WebElement ConfPassWord;
	
	@FindBy(name="agreeTerms")
	WebElement iAgree;
	
	
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateSignUpPage() throws Exception
	{	
		System.out.println("Selenium Trying to Click Sign Up! Please Wait....");
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(signup));
		signup.click();		
		return driver.getTitle();
	}
	
	public void UserDetails()
	{
		Select Edition = new Select(edition);
		Edition.selectByVisibleText("Free Edition");
		System.out.println("Free Edition is Selected");
		
		FirstName.sendKeys("Binayak");
		
		SurName.sendKeys("Padhi");
		
		EmailId.sendKeys("binayakimca@gmail.com");
		
		ConfEmailId.sendKeys("binayakimca@gmail.com");
		
		UserName.sendKeys("BinayakV");
		
		PassWord.sendKeys("Velss");
		
		ConfPassWord.sendKeys("Velvizhi");
		
		iAgree.click();
	}
	

}
