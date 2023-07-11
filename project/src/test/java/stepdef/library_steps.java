package stepdef;

import com.page.Basepage;
import com.page.Playlist_page;
import com.page.constant;
import com.page.librarypage;
import com.page.login_page;

import common_Methods.common_methods;
import common_Methods.validations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class library_steps 
{
	@Given("I click on library tab and validate")
	public void i_click_on_library_tab_and_validate() throws Exception 
	{
//		Basepage.driverIn();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.HomePageUrl, "home page url is not displayed");
//		login_page.profilelgnbtn_click();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.LoginPageurl, "login page url is not displayed");
//		login_page.enterEmailId(constant.emailId);
//		login_page.enterPassword(constant.password);
//		login_page.ClickOnLoginBtn();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.DashBoardPageUrl, "Dashboard page url is not displayed");
//		Playlist_page.NavigateToPlaylist();
//		validations.IsTrue(common_methods.CurrentUrl(), constant.PlayListUrl, "home page url is not displayed");
//		Playlist_page.ClickOnCreatePlaylist();
//		validations.IsDsiplayed(Playlist_page.CPpopupBy(),"playlist popup is not displayed");
//		Playlist_page.Entername();
//		Playlist_page.clickoncreateButton();
//		librarypage.ClickOnlibrary();
		librarypage.ClickOnlibrary();
		validations.IsTrue(common_methods.CurrentUrl(), constant.libraryUrl, "library page url is not displayed");
	}

	@Given("I click on add to playlist")
	public void i_click_on_add_to_playlist() throws Exception
	{
		librarypage.AddplaylistButton();
	}

	@Then("I validate the librarypopup is displayed")
	public void i_validate_the_librarypopup_is_displayed() throws Exception
	{
		validations.IsDsiplayed(librarypage.Libarypopup(),"library popup is not Display");
	}

	@Then("I Select the course")
	public void i_select_the_course() throws Exception 
	{
		librarypage.SelectCourse();
	}

	@Then("I click on save")
	public void i_click_on_save() throws Exception
	{
		librarypage.Save();
	}
}
