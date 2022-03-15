package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	public WebDriver driver;
	
	public MainPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By getMatchesClass = By.xpath("//*[@class='gs-o-list-ui__item gs-u-pb-']");
	
	By teamsGrp1 = By.xpath("//li[@class='gs-o-list-ui__item gs-u-pb-']/article/div/span[starts-with(@data-team-id,'TFB')]/span/span[@class='sp-c-fixture__team-name-wrap']/span");
	By teamsGrp2 = By.xpath("//li[@class='gs-o-list-ui__item gs-u-pb-']/a/article/div/span[starts-with(@data-team-id,'TFB')]/span/span[@class='sp-c-fixture__team-name-wrap']/span");
	
	By searchButton =  By.xpath("//*[contains(text(),'Search BBC')]");
	
	By searchTextBox = By.cssSelector("input[id='se-searchbox-input-field']");
	
	By searchIcon = By.cssSelector("button[class='se-searchbox__submit']");
	
	By newsItems = By.cssSelector("a[href*='bbc.co.uk/pro']");
	
	By signInBtn = By.xpath("//span[@id='idcta-username']");
	
	By email = By.id("user-identifier-input");
	By pswd = By.id("password-input");
	By signIn = By.id("submit-button");
	
	public List<WebElement> getMatches() throws IOException
	{
		return driver.findElements(getMatchesClass);
	}
	
	public List<WebElement> getTeamsGrp1() throws IOException
	{
		return driver.findElements(teamsGrp1);
	}
	public List<WebElement> getTeamsGrp2() throws IOException
	{
		return driver.findElements(teamsGrp2);
	}
	
	public WebElement getSearchButton() throws IOException
	{
		return driver.findElement(searchButton);
	}
	public WebElement getSearchTextBox() throws IOException
	{
		return driver.findElement(searchTextBox);
	}
	public WebElement getSearchIconClick() throws IOException
	{
		return driver.findElement(searchIcon);
	}
	
	public List<WebElement> getAllNewsItems() throws IOException
	{
		return driver.findElements(newsItems);
	}
	
	public WebElement getSignInBtn() throws IOException
	{
		return driver.findElement(signInBtn);
	}
	public WebElement getEmail() throws IOException
	{
		return driver.findElement(email);
	}
	public WebElement getPswd() throws IOException
	{
		return driver.findElement(pswd);
	}
	public WebElement getSignIn() throws IOException
	{
		return driver.findElement(signIn);
	}
	

}
