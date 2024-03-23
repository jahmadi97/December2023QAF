package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHome;

public class GoogleSearch extends GoogleBase {
 
	GoogleHome gh;

	@Given("I am on Google homepage")
	public void i_am_on_google_homepage() {



		// call the launchBrowser

		launchBrowser();

	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {

		// step 1: identify or locate the element
		// 8 locators: id, name, class name, html tag, link text, partial link text,
		// xpath, css selector

gh=new GoogleHome(driver);
gh.enterSearch(string);
		

		// step 2: perform the action

	}

	@When("I click Search button")
	public void i_click_search_button() {

	gh.clickSearch();
	
	}
	
	
	

	@Then("I recieve the result")
	public void i_recieve_the_result() {
		WebElement resultStats;
		resultStats = driver.findElement(By.id("result-stats"));

		String results = resultStats.getText();
		System.out.println("==================================");
		System.out.println(results);
		System.out.println("==================================");

		closeBrowser();
		
		
	}

}
