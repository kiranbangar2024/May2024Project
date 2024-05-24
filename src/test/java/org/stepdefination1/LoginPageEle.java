package org.stepdefination1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageEle {
	WebDriver driver;
	WebDriverWait wt;
	@FindBy(css=("input[title^='Search for Products']"))
	private WebElement enterinsearch1;
	
	@FindBy(xpath=("//div[@class='_2NhoPJ']//div[@class='_3jeYYh']"))
	private WebElement loginbutton;
	
	
	public LoginPageEle(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("in LoginPageEle Constructor");
		PageFactory.initElements(driver, this);
		wt=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public Boolean isSearchDisplay()
	{
		System.out.println("search field displyed");
		return enterinsearch1.isDisplayed();
		
	}
	
	public Boolean isloginButtonDisplay()
	{
		System.out.println("login button displyed");
		return loginbutton.isDisplayed();
	}
	
	public void EnterinSearchField()
	{
		System.out.println("Enter in search field");
		wt.until(ExpectedConditions.visibilityOf(enterinsearch1));
		enterinsearch1.sendKeys("samsung mobiles");
		enterinsearch1.sendKeys(Keys.ENTER);
		//loginbutton.click();
		//search1.click();
		//System.out.println("clicked on search button");
		//search1.sendKeys("Samsung");
		
//		S
		
		
		
	}
}
