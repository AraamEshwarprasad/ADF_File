package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class workprofile_page 
{
	//x.path
	
	//public static final By HibuttonBy = By.xpath("//div[@id='loginSection']");
	public static final By dropdowninfoBy = By.xpath("//i[@class='fa fa-chevron-down']");
	public static final By workprofileButtonBy = By.xpath("//a[@id='MyWorkProfileTab']");	
	public static final By personalprofilBy = By.xpath("//div[@id='MyWorkProfile']");
	
	public static final By specialityBy = By.xpath("//select[@id='selSpecialty']");
	public static final By calenderBy = By.xpath("//i[@class='icon-calendar']");
	public static final By DateBy = By.xpath("//td[text()='18']");
	public static final By secondaryspecialityBy = By.xpath("//select[@id='selSpecialty2']");
	public static final By ABMSBoardBy = By.xpath("//select[@id='selBoards']");
	public static final By boardidBy = By.xpath("//input[@id='txtBoardId']");
	public static final By birthmonthBy = By.xpath("//select[@name='container_1$profiletabs_0$ddlMonth']");
	public static final By birthdayBy = By.xpath("//select[@id='ddlDay']");
	public static final By saveButtonBy = By.xpath("//input[@value='SAVE']");
	
	
	//WebElement

//	public static WebElement hibtn()
//	{
//		return Basepage.getDriver().findElement(HibuttonBy);
//	}
	public static WebElement Dropdowninfo()
	{
		return Basepage.getDriver().findElement(dropdowninfoBy);
	}
	public static WebElement WorkProfilebtn()
	{
		return Basepage.getDriver().findElement(workprofileButtonBy);
	}
	public static WebElement PersonalprofileDisplay()
	{
		return Basepage.getDriver().findElement(personalprofilBy);
	}
	
	
	public static WebElement Speciality()
	{
		return Basepage.getDriver().findElement(specialityBy);
	}
	public static WebElement Calender()
	{
		return Basepage.getDriver().findElement(calenderBy);
	}
	public static WebElement date()
	{
		return Basepage.getDriver().findElement(DateBy);
	}
	public static WebElement selectingSecSpeciality()
	{
		return Basepage.getDriver().findElement(secondaryspecialityBy);
	}
	public static WebElement clickABMSBoard()
	{
		return Basepage.getDriver().findElement(ABMSBoardBy);
	}
	public static WebElement clickBoardID()
	{
		return Basepage.getDriver().findElement(boardidBy);
	}
	public static WebElement clickBirthmonth()
	{
		return Basepage.getDriver().findElement(birthmonthBy);
	}
	public static WebElement clickBirthDay()
	{
		return Basepage.getDriver().findElement(birthdayBy);
	}
	public static WebElement clicksaveBtn()
	{
		return Basepage.getDriver().findElement(saveButtonBy);
	}
	
	
	//action
	public static void dropdown() throws Exception
	{
		Thread.sleep(3000);
		Dropdowninfo().click();
		Thread.sleep(3000);
	} 
	public static void workprofile() throws Exception
	{
		Thread.sleep(2000);
		WorkProfilebtn().click();
		Thread.sleep(3000);
	} 
	
	public static void SpecialitydropdownBy() throws Exception
	{
		Thread.sleep(2000);
		Speciality().click();
		Thread.sleep(3000);
		
		Select sc = new Select(Speciality()); 
		sc.selectByValue(constant.Addictionmedicinevalue);	
	}
	public static void clickoncalender() throws Exception
	{
		Thread.sleep(2000);
		Calender().click();
		Thread.sleep(3000);
	} 
	public static void selectingDate() throws Exception
	{
		Thread.sleep(2000);
		date().click();
		Thread.sleep(3000);
	} 
	public static void SecondarySpecialty() throws Exception
	{
		Thread.sleep(2000);
		selectingSecSpeciality().click();
		Thread.sleep(3000);
		
		Select sc = new Select(selectingSecSpeciality()); 
		sc.selectByValue(constant.cardiacElectrophysiologyvalue);	
	}
	public static void ABMSBoard() throws Exception
	{
		Thread.sleep(2000);
		clickABMSBoard().click();
		Thread.sleep(3000);
		
		Select sc = new Select(clickABMSBoard()); 
		sc.selectByValue(constant.ABMSvalue);	
	}
	
	public static void BoardID() throws Exception
	{
		Thread.sleep(2000);
		clickBoardID().clear();
		Thread.sleep(3000);
		clickBoardID().click();
		clickBoardID().sendKeys("143");
		Thread.sleep(2000);
	} 
	public static void BirthMonth() throws Exception
	{
		Thread.sleep(2000);
		clickBirthmonth().click();
		Thread.sleep(3000);
		
		Select sc = new Select(clickBirthmonth()); 
		sc.selectByValue(constant.birthmonthvalue);	
	}
	public static void BirthDay() throws Exception
	{
		Thread.sleep(2000);
		clickBirthDay().click();
		Thread.sleep(3000);
		
		Select sc = new Select(clickBirthDay()); 
		sc.selectByValue(constant.BirthDayvalue);	
	}
	public static void SaveButton() throws Exception
	{
		Thread.sleep(2000);
		clicksaveBtn().click();
		Thread.sleep(3000);
	} 
	
}
