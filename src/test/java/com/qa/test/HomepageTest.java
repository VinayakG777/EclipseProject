package com.qa.test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pages.qa.HomePage;
import com.qa.testBase.TestBase;

public class HomepageTest extends TestBase {

	
@Test
public void homePageTest()
{
	HomePage home=new HomePage(driver);
	JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
	home.clickOnTermInsurance();
}
}
