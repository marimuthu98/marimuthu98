package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Test extends Baseclass {
	public Test() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id= "email")
	private WebElement username;

	@FindBy(id= "pass")
	private WebElement password;

	@FindBy(id= "u_0_d_w4")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
