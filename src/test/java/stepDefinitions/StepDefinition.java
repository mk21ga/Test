package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.MainPage;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Automation.Sports.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;

@RunWith(Cucumber.class)
public class StepDefinition extends Base {

	MainPage mp;
	List<WebElement> newsArticles;
    @Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
    	
    	driver = initializeDriver();
        
    }

    @When("^User navigates to \"([^\"]*)\"$")
    public void user_navigates_to_something(String url) throws Throwable {
        
    	driver.get(url);
    }

    @Then("^He should get all the day's matches and teams$")
    public void he_should_get_all_the_days_matches_and_teams() throws Throwable {
        
    	ArrayList<WebElement> teams = new ArrayList<WebElement>();
    	mp = new MainPage(driver);
		if (!mp.getMatches().isEmpty()) {
			List<WebElement> matches = mp.getMatches();
			System.out.println(matches.size());
			List<WebElement> teamsCount1 = mp.getTeamsGrp1();
			List<WebElement> teamsCount2 = mp.getTeamsGrp2();
			List<WebElement> finalTeamList = new ArrayList<WebElement>(teamsCount1);
			finalTeamList.addAll(teamsCount2);
			
			System.out.println("Teams Count:- "+finalTeamList.size());
			
			for(WebElement team : finalTeamList)
			{
				//if(team.getText().contains("[0-9]+"))
				System.out.println(team.getText());
			}
		}
    }

    @And("^A output message if there are no matches$")
    public void a_output_message_if_there_are_no_matches() throws Throwable {
       
    	if(mp.getMatches().isEmpty())
    	{
    		System.out.println("There are no matches today");
    	}
    }
    
    @And("^Close browser$")
    public void close_browser() throws Throwable {
       
    	driver.close();
    }
    
    @And("^Click on search icon and type sports$")
    public void click_on_search_icon_and_type_sports() throws Throwable {
    	mp = new MainPage(driver);
    	mp.getSearchButton().click();
    	mp.getSearchTextBox().sendKeys("sports");
    	mp.getSearchIconClick().click();
        
    }
    
    @Then("^He gets all articles related to sports$")
    public void he_gets_all_articles_related_to_sports() throws Throwable {
     
    	newsArticles = mp.getAllNewsItems();
    }

    @And("^Outputs first and last heading$")
    public void outputs_first_and_last_heading() throws Throwable {
    	
    	for(int i =0;i<newsArticles.size();i++)
    	{
    		if(i==0 || i==newsArticles.size()-1)
    		System.out.println(newsArticles.get(i).getText());
    	}

    }
    
    @And("^Click on Sign In button$")
    public void click_on_sign_in_button() throws Throwable {
    	mp = new MainPage(driver);
    	mp.getSignInBtn().click();
    }

    @And("^Enter (.+) and  (.+)$")
    public void enter_and(String username, String password) throws Throwable {
    	mp.getEmail().sendKeys(username);
    	mp.getPswd().sendKeys(password);
       
    }
    
    @And("^Click on Sign In button in the page$")
    public void click_on_sign_in_button_in_the_page() throws Throwable {
       mp.getSignIn().click();
    }

	@Then("^User should get error msg as \"([^\"]*)\"$")
    public void user_should_get_error_msg_as_something(String errorMsg) throws Throwable {
		
		System.out.println("Error Msg:- "+errorMsg);
    }
    
    
}

