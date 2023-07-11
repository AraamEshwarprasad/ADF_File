package stepdef;

import com.page.Basepage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	@Before
	public void beforeScenario() throws Exception{
		Basepage.driverIn();

		//System.out.println("This will run before the Scenario");
	}

//	@After
//	public void afterScenario(){
//		Basepage.quit();
//		//System.out.println("This will run after the Scenario");
//	}
}
