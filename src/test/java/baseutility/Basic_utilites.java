package baseutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Basic_utilites {
	
	
	
	public WebDriver startupmethode()
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");
		 driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(Configreader1.getdata("url"));
		return driver;
	}
	
	
}
