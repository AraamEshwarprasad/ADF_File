package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Playlist_page 
{
	//x.path
	public static final By PlaylistsBy=By.xpath("//span[text()='Playlists']");
	public static final By CreatePlaylistBtnBy = By.xpath("//a[@title='Create playlist']");
	public static final By CPpopupBy= By.xpath("//div[@id='CreateModal']");
	public static final By enternameBy=By.xpath("//input[@id='txtPlaylistName']");
	public static final By createButtonBy = By.xpath("//input[@value='CREATE']");
	public static final By clickonAllBy= By.xpath("//a[@id='lnkAllCM']");
	public static final By backtoplaylisttabBy= By.xpath("//span[text()='Playlists']");
	//public static final By AllbtnBy= By.xpath("//a[text()='All (81) ']");



	//WebElement
	public static WebElement PlaylistTab()
	{
		return Basepage.getDriver().findElement(PlaylistsBy);
	}
	public static WebElement CreatePlaylistBtn()
	{
		return Basepage.getDriver().findElement(CreatePlaylistBtnBy);
	}
	public static WebElement CPpopupBy()
	{
		return Basepage.getDriver().findElement(CPpopupBy);
	}
	public static WebElement nameEnter()
	{
		return Basepage.getDriver().findElement(enternameBy);
	}
	public static WebElement CreateBn()
	{
		return Basepage.getDriver().findElement(createButtonBy);
	}
	public static WebElement Allbtn()
	{
		return Basepage.getDriver().findElement(clickonAllBy);
	}
	public static WebElement Backplaylist()
	{
		return Basepage.getDriver().findElement(backtoplaylisttabBy);
	}
//	public static WebElement allButton()
//	{
//		return Basepage.getDriver().findElement(AllbtnBy);
//	}
	





	//action
	public static void NavigateToPlaylist() throws Exception
	{
		Thread.sleep(3000);
		PlaylistTab().click();
		Thread.sleep(3000);
	}
	public static void ClickOnCreatePlaylist() throws Exception
	{
		CreatePlaylistBtn().click();
		Thread.sleep(3000);
	}
	public static void Entername() throws Exception
	{
		nameEnter().click();
		Thread.sleep(3000);
		nameEnter().sendKeys("ad1234567891");
	}
	public static void Entername2() throws InterruptedException
	{
		nameEnter().click();
		Thread.sleep(3000);
		nameEnter().sendKeys("af12345678");
	}
	public static void clickoncreateButton() throws InterruptedException
	{
		Thread.sleep(2000);
		CreateBn().click();
	}
	public static void clickonAllbtn() throws InterruptedException
	{
		Thread.sleep(2000);
		Allbtn().click();
	}
	public static void BackToPlaylist() throws Exception
	{
		Thread.sleep(3000);
		Backplaylist().click();
		Thread.sleep(3000);
	}
//	public static void Allbutton() throws Exception
//	{
//		Thread.sleep(3000);
//		allButton().click();
//		Thread.sleep(3000);
//	}
	







}
