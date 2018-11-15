package br.com.base.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
	protected WebDriver driver;

	public Page(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getElement(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
}
