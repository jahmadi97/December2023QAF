package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {

	
	WebDriver driver; 
	
	public GoogleHome(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement searchBox= driver.findElement(By.id("APjFqb"));
	
	@FindBy(id="APjFqb")
   WebElement searchBox;
	
	//searchBox.sendKeys(String string);
	
	public void enterSearch(String string) {
			searchBox.sendKeys(string);
			
	}
		
		//WebElement searchButton=driver.findElement(By.name("btnK"));
		@FindBy(name="btnK")
		WebElement searchButton;
		
		public void clickSearch() {
			searchButton.submit();
			
		}
		
}

		
		
	

















