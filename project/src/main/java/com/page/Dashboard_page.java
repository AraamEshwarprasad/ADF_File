package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboard_page 
{
	//x.path
	public static final By dashboardBtnBy= By.xpath("//span[text()='Dashboard']");
	
	
	
	//WebElement
	public static WebElement Dashboardbtn()
	{
		return Basepage.getDriver().findElement(dashboardBtnBy);
	}
	
	
	//action
	public static void ClickOnDashboard() throws Exception
	{
		Dashboardbtn().click();
		Thread.sleep(3000);
	}
	
}
