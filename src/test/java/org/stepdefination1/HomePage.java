package org.stepdefination1;

import java.time.Duration;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class HomePage {
	
	WebDriverWait wt;
	
	@FindBy(className="_9QVEpD")
	private WebElement nextbutton;
	
	@FindBy(xpath=("//div[@class='col col-7-12']//div[starts-with(text(),'SAMSUNG')]"))
	private List <WebElement> mobilenames;
	
	@FindBy(tagName=("body"))
	private WebElement ScrollDown1;
	
	HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		wt=new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	public void Scroll_Down1(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",nextbutton );
	}
	public void Write_Mobile_Names()
	{
	//	wt.until(ExpectedConditions.visibilityOfAllElements(mobilenames));
		System.out.println(mobilenames.size());
		
		for(int i=0;i<mobilenames.size();i++)
		{
			System.out.println(mobilenames.get(i).getText());
		}
	}
	public void next_button(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", nextbutton);
		
        //wt.until(ExpectedConditions.visibilityOf(nextbutton));
	
	}
	
	public Boolean Visible_nextButton()
	{
		return nextbutton.isDisplayed();
	}

}
