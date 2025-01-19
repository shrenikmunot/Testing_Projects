package org.ej.codedefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Startup {
	
	WebDriver driver = new EdgeDriver();
	
	
	//Given user opens the chrome browser
	@Given("user opens the chrome browser")
	public void chrome() {
		driver.manage().window().maximize();
		System.out.println("Launching Browser");
	}
	
	//When user enters  the URL "http://localhost:90/finsys"
	@When("user enters  the URL {string}")
	public void navigate(String URL) {
		driver.get("http://localhost:90/finsys");
		System.out.println("Website Navigation");
	}
	
//	And user enters the valid "dummyfm" as Username
	@And("user enters the valid {string} as Username")
	public void uname(String username) {
		WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.sendKeys("dummyfm");
		System.out.println("Entering Username");
	}
	
//	And user enters valid "passw0rd" as the Password
	@And("user enters valid {string} as the Password")
	public void pword(String password) {
		WebElement pword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pword.sendKeys("passw0rd");
		System.out.println("Entering Password");
	}
	
//	And clicks on the Login Button
	@And("clicks on the Login Button")
	public void lclick() {
		WebElement lClick = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
		lClick.click();
		System.out.println("Login Click");
	}
	
//	Then Application  should be on the HomePage and user should be able to view Welcome dummy[FM] text on the top of the page.
	@Then("Application  should be on the HomePage and user should be able to view Welcome dummy[FM] text on the top of the page.")
	public void wcome() {
		
		
		try {
			WebElement wcome = driver.findElement(By.xpath("//div/*[1]"));
			
			if(wcome.isDisplayed()) 
			{
			System.out.println("Login Successful");
			}
			else {
			System.out.println("Invalid Login");
			}
		}
		catch (Exception e) {
			System.out.println("Hello");
		}
		System.out.println("Welcome Dummy");
	}
	
//	When user clicks on Required Startup Funds in the Main Activity Window
	@When("user clicks on Required Startup Funds in the Main Activity Window")
	public void rsfClick() {
		WebElement rsf = driver.findElement(By.xpath("//a[@title='Required Startup Funds']"));
		rsf.click();
		System.out.println("Form Click");
	}
	
//	And user clicks on the New Button of the form
	@And("user clicks on the New Button of the form")
	public void nClick() {
		driver.switchTo().frame(0);
		WebElement nClick = driver.findElement(By.xpath("//a[@onclick='newItem()']"));
		nClick.click();
		System.out.println("New Click");
	}
	
//	Then the Startup Funds form is displayed
	@Then("the Startup Funds form is displayed")
	public void sForm() {
		System.out.println("Startup Form Display");
	}
	
//	When user clicks and selects an option from the Company dropdown
	@When("user clicks and selects an option from the Company dropdown")
	public void cDrop() {
		WebElement cDrop = driver.findElement(By.xpath("//select[@id='companyid']"));
		Select company = new Select(cDrop);
		company.selectByVisibleText("SQL(44)");
		System.out.println("Company Dropdown");
	}
	
//	And user clicks and enters Software
	@And("user clicks and enters Software")
	public void software() {
		WebElement software = driver.findElement(By.xpath("//input[@textboxname='software']/following-sibling::span/input"));
		software.sendKeys("1500");
		System.out.println("Software");
	}
	
//	And user clicks and enters Salaries and Wages
	@And("user clicks and enters Salaries and Wages")
	public void saWa() {
		WebElement saWa = driver.findElement(By.xpath("//input[@textboxname='salary_wages']/following-sibling::span/input"));
		saWa.sendKeys("5000");
		System.out.println("Salaries and Wages");
	}
	
//	And user clicks and enters Insurance & Premium
	@And("user clicks and enters Insurance & Premium")
	public void insurance() {
		WebElement insurance = driver.findElement(By.xpath("//input[@textboxname='insurance_premiums']/following-sibling::span/input"));
		insurance.sendKeys("4000");
		System.out.println("Insurance");
	}
	
//	And user clicks and enters Inventory
	@And("user clicks and enters Inventory")
	public void inventory() {
		WebElement inventory = driver.findElement(By.xpath("//input[@textboxname='inventory']/following-sibling::span/input"));
		inventory.sendKeys("8500");
		System.out.println("Inventory");
	}
	
//	And user clicks and enters Legal & Accounting Fees
	@And("user clicks and enters Legal & Accounting Fees")
	public void legal() {
		WebElement legal = driver.findElement(By.xpath("//input[@textboxname='legal_accounting_fees']/following-sibling::span/input"));
		legal.sendKeys("4000");
		System.out.println("Accounting");
	}
	
//	And user clicks and enters Rent Deposits
	@And("user clicks and enters Rent Deposits")
	public void rent() {
		WebElement rent = driver.findElement(By.xpath("//input[@textboxname='rent_deposits']/following-sibling::span/input"));
		rent.sendKeys("3000");
		System.out.println("Rent");
	}

//	And user clicks and enters Advertisement
	@And("user clicks and enters Advertisement")
	public void ad() {
		WebElement ad = driver.findElement(By.xpath("//input[@textboxname='advt_promotions']/following-sibling::span/input"));
		ad.sendKeys("5000");
		System.out.println("Advertisement");
	}
	
//	And user clicks and enters Licenses
	@And("user clicks and enters Licenses")
	public void lic() {
		WebElement lic = driver.findElement(By.xpath("//input[@textboxname='licenses']/following-sibling::span/input"));
		lic.sendKeys("7500");
		System.out.println("Licenses");
	}
	
//	And user clicks and enters Other
	@And("user clicks and enters Other")
	public void other() {
		WebElement other = driver.findElement(By.xpath("//input[@textboxname='other']/following-sibling::span/input"));
		other.sendKeys("2500");
		System.out.println("Other");
	}
	
//	And user clicks on Total input box
	@And("user clicks on Total input box")
	public void tClick() {
		WebElement tClick = driver.findElement(By.xpath("//div[@name='total']"));
		tClick.click();
		System.out.println("Total Click");
	}
	
//	And user clicks on the Save Button
	@And("user clicks on the Save Button")
	public void sButton() {
		WebElement sButton = driver.findElement(By.xpath("//span[@class='l-btn-icon icon-save']"));
		sButton.click();
		System.out.println("Save Button");
	}
	
//	Then the Startup Funds details are displayed
	@Then("the Startup Funds details are displayed")
	public void fDisplay() {
		
		try {
			Thread.sleep(4000);
			WebElement fDisplay = driver.findElement(By.xpath("//*[.='SQL']"));
			
			if (fDisplay.isDisplayed()) {
				System.out.println("Entry Updated Succesfully");
			}
			else {
				System.out.println("Entry Invalid. Try Again");
			}
		} catch (Exception e) {
			System.out.println("This is the catch statement. Howdy!");
		}
		System.out.println("Details displayed");
		driver.quit();
	}
	
}
