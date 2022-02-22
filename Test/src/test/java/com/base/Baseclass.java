package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	protected WebDriver driver;

	public void browserLanuch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void enterText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public void btnclick(WebElement element) {
		element.click();

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public WebElement findLocatorById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;
	}

	public WebElement findLocatorByName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;
	}

	public WebElement findLocatorByClassName(String data) {
		WebElement element = driver.findElement(By.className(data));
		return element;
	}

	public WebElement findLocatorByXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}

	public void implicitlyWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	public String gettitle() {
		String title = driver.getTitle();
		return title;

	}

	public void closebrowser() {
		driver.close();
	}

	public void closeallbrowser() {
		driver.quit();

	}

	public void alertByAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public void alertByDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
		

	}

	public void alertBySendkeys(String data) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);

	}

	public void selectByIndex(WebElement element, int indexnum) {
		Select s = new Select(element);
		s.selectByIndex(indexnum);
	}

	public void selectByValue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void selectByVisibletext(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void deselectByIndex(WebElement element, int indexnum) {
		Select s = new Select(element);
		s.deselectByIndex(indexnum);
	}

	public void deselectByValue(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByValue(data);
	}

}