package org.stepdefination1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(tagName=("body"))
	private WebElement ScrollDown1;
	
	HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Scroll_Down1()
	{
		for(int i=0;i<=7;i++)
		{
		ScrollDown1.sendKeys(Keys.PAGE_DOWN);
		}
	}

}
