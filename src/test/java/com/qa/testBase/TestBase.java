package com.qa.testBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.utility.ConfigReader;

public class TestBase {
public static WebDriver driver;
//ChromeOptions options;//
	@BeforeSuite
	@Test
	public void initBrowser() throws IOException
	{
		 //options=new ChromeOptions();//
	//options.addArguments("--disable-notifications");//
		ConfigReader conf=new ConfigReader();
		String browsername=	conf.readConfig("browser");
		if(browsername.equals("chrome"))
		{
		    driver=new ChromeDriver();
		}
		else if(browsername.equals("edge"))
		{
			driver=new FirefoxDriver();
		}
		String url=	conf.readConfig("testsiteurl");
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterSuite
	@Test
	public void tearDown()
	{
		
	}
	
}
