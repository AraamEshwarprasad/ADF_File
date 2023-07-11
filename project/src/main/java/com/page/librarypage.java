package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class librarypage 
{
	//x.path
	public static final By librarybn=By.xpath("//span[text()='Library']");
	public static final By addplaylistBnBy =By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl08_AddToPlaylistButton_hlModal']");
	public static final By librarypopupBy= By.xpath("//p[text()='You can also add this course to a Playlist:']");
	public static final By selectcourseBy= By.xpath("//input[@id='cb3436676']");
	public static final By SaveButtonBy= By.xpath("//input[@value='SAVE']");
	
	
	
	
	//WebElement
	public static WebElement library()
	{
		return Basepage.getDriver().findElement(librarybn);
	}
	public static WebElement AddPlaylist()
	{
		return Basepage.getDriver().findElement(addplaylistBnBy);
	}
	public static WebElement Libarypopup()
	{
		return Basepage.getDriver().findElement(librarypopupBy);
	}
	
	public static WebElement courseSelecting()
	{
		return Basepage.getDriver().findElement(selectcourseBy);
	}
	public static WebElement SaveButton()
	{
		return Basepage.getDriver().findElement(SaveButtonBy);
	}
	
	
	
	
	
	//action
	public static void ClickOnlibrary() throws Exception
	{
		library().click();
		Thread.sleep(3000);
	}
	public static void AddplaylistButton() throws Exception
	{
		AddPlaylist().click();
		Thread.sleep(3000);
	}
	public static void SelectCourse() throws Exception
	{
		courseSelecting().click();
		Thread.sleep(3000);
	}
	public static void Save() throws Exception
	{
		SaveButton().click();
		Thread.sleep(3000);
	}
	
	
	






}
