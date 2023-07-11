package stepdef;

import com.page.Basepage;
import com.page.Dashboard_page;
import com.page.Playlist_page;
import com.page.constant;
import com.page.librarypage;
import com.page.logOut_page;
import com.page.login_page;

import common_Methods.common_methods;
import common_Methods.validations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class playlist_Operations_steps
{
//	@Given("I am at the audiodigest home page to login as prerequsite")
//	public void i_am_at_the_audiodigest_home_page_to_login_as_prerequsite() throws Exception 
//	{
//		//Basepage.driverIn();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.HomePageUrl, "home page url is not displayed");
//		login_page.profilelgnbtn_click();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.LoginPageurl, "login page url is not displayed");
//		login_page.enterEmailId(constant.emailId);
//		login_page.enterPassword(constant.password);
//		login_page.ClickOnLoginBtn();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.DashBoardPageUrl, "Dashboard page url is not displayed");
//
//
//	}
//
//	@Given("I click on playlist tab and validate")
//	public void i_click_on_playlist_tab_and_validate() throws Exception
//	{
//		Playlist_page.NavigateToPlaylist();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.PlayListUrl, "playlist page url is not displayed");
//	}
//
//	@Given("I click on create playlist")
//	public void i_click_on_create_playlist() throws Exception 
//	{
//		Playlist_page.ClickOnCreatePlaylist();
//	}
//
//	@Then("I validate the playlistpop is displayed")
//	public void i_validate_the_playlistpop_is_displayed() throws Exception 
//	{
//		validations.IsDsiplayed(Playlist_page.CPpopupBy(),"playlist popup is not displayed");
//	}
//
//	@Then("I enter playlist name")
//	public void i_enter_playlist_name() throws Exception 
//	{
//		Playlist_page.Entername();
//	}
//
//	@Then("I click on create")
//	public void i_click_on_create() throws InterruptedException 
//	{
//		Playlist_page.clickoncreateButton();
//	}
	
	
	@Given("I am at the audiodigest home page to login as prerequsite")
	public void i_am_at_the_audiodigest_home_page_to_login_as_prerequsite() throws Exception
	{
		validations.IsTrue(common_methods.CurrentUrl(), constant.HomePageUrl, "home page url is not displayed");
		login_page.profilelgnbtn_click();
		validations.IsTrue(common_methods.CurrentUrl(), constant.LoginPageurl, "login page url is not displayed");
		login_page.enterEmailId(constant.emailId);
		login_page.enterPassword(constant.password);
		login_page.ClickOnLoginBtn();
		validations.IsTrue(common_methods.CurrentUrl(), constant.DashBoardPageUrl, "Dashboard page url is not displayed");
	}

	@Given("I click on playlist tab and validate")
	public void i_click_on_playlist_tab_and_validate() throws Exception
	{
		Playlist_page.NavigateToPlaylist();
		validations.IsTrue(common_methods.CurrentUrl(), constant.PlayListUrl, "playlist page url is not displayed");
	}

	@Given("I click on create playlist")
	public void i_click_on_create_playlist() throws Exception
	{
		Playlist_page.ClickOnCreatePlaylist();
	}

	@Then("I validate the playlistpop is displayed")
	public void i_validate_the_playlistpop_is_displayed() throws Exception 
	{
		validations.IsDsiplayed(Playlist_page.CPpopupBy(),"playlist popup is not displayed");
	}

	@Then("I enter playlist name")
	public void i_enter_playlist_name() throws Exception 
	{
		Playlist_page.Entername();
	}

	@Then("I click on create button")
	public void i_click_on_create_button() throws InterruptedException 
	{
		Playlist_page.clickoncreateButton();
	}

	@Then("I navigate to library tab and add course to playlist")
	public void i_navigate_to_library_tab_and_add_course_to_playlist() throws Exception
	{
		librarypage.ClickOnlibrary();
		librarypage.AddplaylistButton();
		librarypage.SelectCourse();
		librarypage.Save();
	}

	@Then("I navigate to dasboard page and validate playlist")
	public void i_navigate_to_dasboard_page_and_validate_playlist() throws Exception
	{
		Dashboard_page.ClickOnDashboard();
	}

	@Then("I logout user")
	public void i_logout_user() throws Exception 
	{
		logOut_page.LogoutBtn();
	}


}
