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





	//action
	public static void NavigateToPlaylist() throws Exception

	{
		Thread.sleep(5000);
		PlaylistTab().click();
		Thread.sleep(3000);

	}
	public static void ClickOnCreatePlaylist() throws Exception
	{
		CreatePlaylistBtn().click();
		Thread.sleep(5000);
	}
	public static void Entername() throws Exception
	{
		nameEnter().click();
		Thread.sleep(5000);
		nameEnter().sendKeys("chint");
	}
	public static void clickoncreateButton() throws InterruptedException
	{
		Thread.sleep(2000);
		CreateBn().click();

	}





















}
