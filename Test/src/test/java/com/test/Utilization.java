package com.test;

import org.openqa.selenium.WebElement;

import com.base.Baseclass;

public class Utilization extends Baseclass {
	public static void main(String[] args) {

		Test a = new Test();
		a.browserLanuch("https://www.facebook.com/");
		
        WebElement element = a.getUsername();
        WebElement id = a.findLocatorById("element");
		a.enterText(id, "maari");
		a.enterText(a.getPassword(), "12345");
	}
}