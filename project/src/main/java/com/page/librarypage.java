package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class librarypage 
{
	//x.path
	public static final By librarybn=By.xpath("//span[text()='Library']");
	public static final By practiceaddplaylistBnBy =By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton_hlModal']");
	public static final By librarypopupBy= By.xpath("//p[text()='You can also add this course to a Playlist:']");
	public static final By selectcourseBy= By.xpath("//input[@id='cb3436451']");
	public static final By SaveButtonBy= By.xpath("//input[@value='SAVE']");
	
	public static final By stateaddplaylist =By.xpath("//td[@class='title']//a[@id='container_2_rgLibrary_ctl00_ctl06_AddToPlaylistButton_hlModal']");
	public static final By selectingcourse2By= By.xpath("//input[@id='cb3437040']");
	
	public static final By playButtonBy= By.xpath("//div[@id='container_2_rgLibrary_ctl00_ctl04_LibraryPlayButton_divPlayContainer']");
	public static final By HibuttonBy = By.xpath("//a[@class='dropdown profile top-head-link']");
	public static final By logoutButtonBy = By.xpath("//a[text()='Logout']");
	
	
	
	
	
//	public static final By preventionBy= By.xpath("//span[text()='Prevention of Infection in Patients with Nonmalignant Hematologic Disorders']");//element display
//	public static final By preventionaddplaylistBy= By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton_hlModal']");
//	public static final By selectingcourseBy= By.xpath("//input[@id='cb3437052']");
//	public static final By smallcellBy= By.xpath("//span[text()='Small-cell Lung Cancer: Evolving Applications of Radiation Therapy and Immunotherapy']"); //element dis
//	public static final By smalladdplaylistBy = By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl06_AddToPlaylistButton_hlModal']");
	
	
	
	//public static final By NewparadigmaddplaylistBy= By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton_hlModal']");
	//public static final By RadiationaddplaylistBy= By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl06_AddToPlaylistButton_hlModal']");
	
	
	//WebElement
	public static WebElement library()
	{
		return Basepage.getDriver().findElement(librarybn);
	}
	public static WebElement PracticeAddplaylist()
	{
		return Basepage.getDriver().findElement(practiceaddplaylistBnBy);
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
	public static WebElement StateAddPlaylist()
	{
		return Basepage.getDriver().findElement(stateaddplaylist);
	}
	public static WebElement selectcourse2()
	{
		return Basepage.getDriver().findElement(selectingcourse2By);
	}
	
	
	public static WebElement playBtn()
	{
		return Basepage.getDriver().findElement(playButtonBy);
	}
	public static WebElement HiBtn()
	{
		return Basepage.getDriver().findElement(HibuttonBy);
	}
	public static WebElement logoutBtn()
	{
		return Basepage.getDriver().findElement(logoutButtonBy);
	}
	
	
	
	
	
//	public static WebElement preventiondisplay()
//	{
//		return Basepage.getDriver().findElement(preventionBy);
//	}
//	public static WebElement Preventionaddplaylist()
//	{
//		return Basepage.getDriver().findElement(preventionaddplaylistBy);
//	}
//	public static WebElement selectCourse()
//	{
//		return Basepage.getDriver().findElement(selectingcourseBy);
//	}
//	public static WebElement smallcelldisplay()
//	{
//		return Basepage.getDriver().findElement(smallcellBy);
//	}
//	public static WebElement smallCelladdplaylist()
//	{
//		return Basepage.getDriver().findElement(smalladdplaylistBy);
//	}
	
	
	
//	public static WebElement newparadigmaddplaylist()
//	{
//		return Basepage.getDriver().findElement(NewparadigmaddplaylistBy);
//	}
//	public static WebElement radiationAddplaylist()
//	{
//		return Basepage.getDriver().findElement(RadiationaddplaylistBy);
//	}
	
	
	
	
	
	
	//action
	public static void ClickOnlibrary() throws Exception
	{
		library().click();
		Thread.sleep(3000);
	}
	public static void AddplaylistButton() throws Exception
	{
		PracticeAddplaylist().click();
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
	public static void stateaddplaylistButton() throws Exception
	{
		StateAddPlaylist().click();
		Thread.sleep(3000);
	}
	public static void SelectingCourse2() throws Exception
	{
		selectcourse2().click();
		Thread.sleep(3000);
	}
	
	
	public static void clickonplayButton() throws Exception
	{
		playBtn().click();
		Thread.sleep(3000);
	}
	public static void clickonHiButton() throws Exception
	{
		HiBtn().click();
		Thread.sleep(3000);
	}
	public static void logout() throws Exception
	{
		logoutBtn().click();
		Thread.sleep(3000);
	}
	
//	public static void preventionAddplay() throws Exception
//	{
//		Thread.sleep(2000);
//		Preventionaddplaylist().click();
//		Thread.sleep(3000);
//	}
//	public static void selectingCourse() throws Exception
//	{
//		Thread.sleep(2000);
//		selectCourse().click();
//		Thread.sleep(3000);
//	}
//	public static void smallcellAddpaly() throws Exception
//	{
//		Thread.sleep(2000);
//		smallCelladdplaylist().click();
//		Thread.sleep(3000);
//	}
	
	
//	public static void newparadigmaddplaylistBtn() throws Exception
//	{
//		newparadigmaddplaylist().click();
//		Thread.sleep(3000);
//	}
//	public static void radiationaddplaylistBtn() throws Exception
//	{
//		radiationAddplaylist().click();
//		Thread.sleep(3000);
//	}
//	
	
	

}
