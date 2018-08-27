package my_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test01 {
	WebDriver driver;
    
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	
	}
	@Test
	public void test_01()
	{
		driver.get("https://www.facebook.com/");
		String title_page = driver.getTitle();
		System.out.println(title_page);
		
	}

}
