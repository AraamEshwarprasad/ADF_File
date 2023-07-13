package stepdef;

import com.page.login_page;
import com.page.workprofile_page;

import common_Methods.validations;
import io.cucumber.java.en.Given;

public class workprofile_steps 
{
	@Given("I click the Hi button on the top right side of the screen")
	public void i_click_the_hi_button_on_the_top_right_side_of_the_screen() throws Exception 
	{
		login_page.profilelgnbtn_click();
		//validations.IsTrue(common_methods.CurrentUrl(), constant.LoginPageurl, "login page url is not displayed");
		//login_page.enterEmailId(constant.emailId);
		//login_page.enterPassword(constant.password);
		//login_page.ClickOnLoginBtn();
		
		//workprofile_page.DashBoard();
		//workprofile_page.dropdown();
		
	}
	@Given("I click the workprofile in the drop down")
	public void i_click_the_workprofile_in_the_drop_down() throws Exception
	{
		workprofile_page.workprofile();
		validations.IsDsiplayed(workprofile_page.Dropdowninfo(),"work profile is not displayed");
	}

	@Given("verify the fields displayed")
	public void verify_the_fields_displayed() throws Exception 
	{
		validations.IsDsiplayed(workprofile_page.PersonalprofileDisplay(),"personalprofile paper is not displayed");
	}
	
	
	
	
	
	
	@Given("I click the drop down button on the top right side of the screen")
	public void i_click_the_drop_down_button_on_the_top_right_side_of_the_screen() throws InterruptedException 
	{
		login_page.profilelgnbtn_click();
	}

	@Given("I change all the workprofile information details")
	public void i_change_all_the_workprofile_information_details() throws Exception
	{
		workprofile_page.SpecialitydropdownBy();
		workprofile_page.clickoncalender();
		workprofile_page.selectingDate();
		workprofile_page.SecondarySpecialty();
		workprofile_page.ABMSBoard();
		workprofile_page.BoardID();
		workprofile_page.BirthMonth();
		workprofile_page.BirthDay();
		
	}

	@Given("I click on save button and validate all information")
	public void i_click_on_save_button_and_validate_all_information() throws Exception
	{
		workprofile_page.SaveButton();
	}
}
