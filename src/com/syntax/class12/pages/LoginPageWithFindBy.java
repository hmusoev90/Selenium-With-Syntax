package com.syntax.class12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.class12.Utils.BaseClass;

public class LoginPageWithFindBy extends BaseClass {

	@FindBy(id="txtUsername")
	public WebElement userNameTextBox;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement passwrodTextBox;
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	public  LoginPageWithFindBy() {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
