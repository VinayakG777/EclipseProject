package com.pages.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//p[contains(text(),'Term Life')]")
private WebElement term_insurance_link;

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
	
}
public void clickOnTermInsurance()
{
	term_insurance_link.click();
}
}
