package stepdef;

import com.page.constant;
import com.page.librarypage;
import com.page.login_page;

import common_Methods.common_methods;
import common_Methods.validations;
import io.cucumber.java.en.Given;

public class library_steps 
{
	//	@Given("I click on library tab and validate")
	//	public void i_click_on_library_tab_and_validate() throws Exception 
	//	{
	////		Basepage.driverIn();
	////		validations.IsTrue(common_methods.CurrentUrl(), constant.HomePageUrl, "home page url is not displayed");
	////		login_page.profilelgnbtn_click();
	////		validations.IsTrue(common_methods.CurrentUrl(), constant.LoginPageurl, "login page url is not displayed");
	////		login_page.enterEmailId(constant.emailId);
	////		login_page.enterPassword(constant.password);
	////		login_page.ClickOnLoginBtn();
	////		validations.IsTrue(common_methods.CurrentUrl(), constant.DashBoardPageUrl, "Dashboard page url is not displayed");
	////		Playlist_page.NavigateToPlaylist();
	////		validations.IsTrue(common_methods.CurrentUrl(), constant.PlayListUrl, "home page url is not displayed");
	////		Playlist_page.ClickOnCreatePlaylist();
	////		validations.IsDsiplayed(Playlist_page.CPpopupBy(),"playlist popup is not displayed");
	////		Playlist_page.Entername();
	////		Playlist_page.clickoncreateButton();
	////		librarypage.ClickOnlibrary();
	//		librarypage.ClickOnlibrary();
	//		validations.IsTrue(common_methods.CurrentUrl(), constant.libraryUrl, "library page url is not displayed");
	//	}
	//
	//	@Given("I click on add to playlist")
	//	public void i_click_on_add_to_playlist() throws Exception
	//	{
	//		librarypage.AddplaylistButton();
	//	}
	//
	//	@Then("I validate the librarypopup is displayed")
	//	public void i_validate_the_librarypopup_is_displayed() throws Exception
	//	{
	//		validations.IsDsiplayed(librarypage.Libarypopup(),"library popup is not Display");
	//	}
	//
	//	@Then("I Select the course")
	//	public void i_select_the_course() throws Exception 
	//	{
	//		librarypage.SelectCourse();
	//	}
	//
	//	@Then("I click on save")
	//	public void i_click_on_save() throws Exception
	//	{
	//		librarypage.Save();
	//	}


	@Given("I click on mydashboard tab")
	public void i_click_on_mydashboard_tab() throws Exception
	{
		login_page.profilelgnbtn_click();
		validations.IsTrue(common_methods.CurrentUrl(), constant.LoginPageurl, "login page url is not displayed");
		login_page.enterEmailId(constant.emailId);
		login_page.enterPassword(constant.password);
		login_page.ClickOnLoginBtn();
//		Dashboard_page.ClickOnDashboard();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.DashBoardPageUrl, "Dashboard page url is not displayed");
			
	}

	@Given("validate courses under my library section")
	public void validate_courses_under_my_library_section() throws Exception
	{
		librarypage.ClickOnlibrary();
		validations.IsDsiplayed(librarypage.allcourses(),"Allcourses is not displayed");
		//validations.IsTrue(common_methods.CurrentUrl(), constant.libraryUrl, "library page url is not displayed");
	}

	@Given("click on play icon of any course")
	public void click_on_play_icon_of_any_course() throws Exception 
	{
		librarypage.clickonplayButton();
	}

	@Given("click on hi and click on logout")
	public void click_on_hi_and_click_on_logout() throws Exception 
	{
		librarypage.clickonHiButton();
		librarypage.logout();
	}
	
	
	
	
	@Given("click on my library")
	public void click_on_my_library() throws Exception
	{
		librarypage.ClickOnlibrary();
	}

	@Given("I select credits option")
	public void i_select_credits_option() throws Exception 
	{
		librarypage.credit();
	}

	@Given("verify sort by option as credits and select speciality from specialty dropdown")
	public void verify_sort_by_option_as_credits_and_select_speciality_from_specialty_dropdown() throws Exception
	{
		librarypage.credit();
	}
	
	
	
	


}
