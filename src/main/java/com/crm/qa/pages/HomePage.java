package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
public class HomePage extends TestBase {

	@FindBy(xpath = "//font[contains(text(), 'User: Naveen K')]")
	WebElement Usernamelabel;
	
	@FindBy(xpath = "//a[contains(text(), 'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath = "//a[contains(text(), 'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath = "//a[contains(text(), 'Tasks')]")
	WebElement taskslink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
