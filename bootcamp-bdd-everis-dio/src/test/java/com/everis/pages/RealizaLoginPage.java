package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class RealizaLoginPage extends BasePage {

	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	protected WebElement botaoLogar;
		
	public RealizaLoginPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}
	
	public void realizarLogin() {
		
		driver.findElement(By.id("email")).sendKeys("daniloc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456789");
		botaoLogar.click();
	}
}