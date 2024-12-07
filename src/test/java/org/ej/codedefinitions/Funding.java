package org.ej.codedefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Funding {
	
	WebDriver driver = new EdgeDriver();
	
//	Given user open the Edge browser
	@Given("user open the Edge browser")
	public void firefox() {
		driver.manage().window().maximize();
		System.out.println("Edge Browser launched");
	}
	
//	And User enters  the URL "http://localhost:90/finsys"
	@And("User enters  the URL {string}")
	public void site(String URL) {
		driver.get("http://localhost:90/finsys");
		System.out.println("Navigated to the site");
	}
	
//	When user enters Valid "dummyfm" as username
	@When("user enters Valid {string} as username")
	public void name(String name) {
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		user.sendKeys("dummyfm");
		System.out.println("Username set");
	}
	
//	And user enters Valid "passw0rd" as password
	@And("user enters Valid {string} as password")
	public void word(String name) {
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("passw0rd");
		System.out.println("Password entered");
	}
	
//	And clicks on Login Button
	@And("clicks on LOGIN Button")
	public void button() {
		WebElement click = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
		click.click();
		System.out.println("Login Button clicked");
	}
	
//	Then Application  should be on the  Home Page and user should be able to view Welcome dummy[FM] text on the top of the page.
	@Then("Application  should be on the  Home Page and user should be able to view Welcome dummy[FM] text on the top of the page.")
	public void mainpage() {
		try {
			WebElement welcome = driver.findElement(By.xpath("//div/*[1]"));
			
			if(welcome.isDisplayed()) 
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
//		System.out.println("Dummy display");
	}
	
//	When user clicks on Funding in the Main Activity Window
	@When("user clicks on Funding in the Main Activity Window")
	public void fund() {
		WebElement fund = driver.findElement(By.xpath("//a[@title='Funding']"));
		fund.click();
		System.out.println("Funding click");
	}
	
//	And user clicks on the New Button
	@And("user clicks on the New Button")
	public void buttonNew() {
		driver.switchTo().frame(0);
			WebElement newButton = driver.findElement(By.xpath("//a[@onclick='newItem()']"));
			newButton.click();
		System.out.println("New button click");
	}
	
//	Then the Funding Form is Displayed
	@Then("the Funding Form is Displayed")
	public void formDisplay() {
		System.out.println("Funding Form Displayed");
	}
	
//	When user clicks and enters Owners Cash Funding
	@When("user clicks and enters Owners Cash Funding")
	public void owner() {
		WebElement owner = driver.findElement(By.xpath("//input[@id='owners_cash_contribution']/following-sibling::span/input"));
		owner.sendKeys("10000");
		System.out.println("Owner's Cash Funding");
	}
	
//	And user clicks and enters Commercial Loan
	@And("user clicks and enters Commercial Loan")
	public void loan() {
		WebElement loan = driver.findElement(By.xpath("//input[@id='commercial_loan']/following-sibling::span/input"));
		loan.sendKeys("15000");
		System.out.println("Commercial Loan");
	}
	
//	When user clicks and enters Loan Interest
	@When("user clicks and enters Loan Interest")
	public void interest() {
		WebElement interest = driver.findElement(By.xpath("//input[@id='loan_roi']/following-sibling::span/input"));
		interest.sendKeys("8");
		System.out.println("Loan Interest");
	}
	
//	And user clicks and enters Term in Months
	@And("user clicks and enters Term in Months")
	public void terms() {
		WebElement terms = driver.findElement(By.xpath("//input[@id='term_months']/following-sibling::span/input"));
		terms.sendKeys("24");
		System.out.println("Term in Months");
	}
	
//	And user clicks on the EMI cell
	@And("user clicks on the EMI cell")
	public void emi() {
		WebElement emi = driver.findElement(By.xpath("//input[@id='emi']"));
		emi.click();
		System.out.println("EMI");
	}
	
//	And user clicks on Save Button
	@And("user clicks on Save Button")
	public void saveB() {
		WebElement saveB = driver.findElement(By.xpath("//span[@class='l-btn-icon icon-save']"));
		saveB.click();
		System.out.println("Save Button Click");
	}
	
//	Then user can see the Funding details after the webpage has been refreshed
	@Then("user can see the Funding details after the webpage has been refreshed")
	public void funding() {
		try {
			Thread.sleep(4000);
			WebElement refresh = driver.findElement(By.xpath("//div[normalize-space()='abc456']"));
			
			if (refresh.isDisplayed()) {
				System.out.println("Entry Updated Succesfully");
			}
			else {
				System.out.println("Entry Invalid. Try Again");
			}
		} catch (Exception e) {
			System.out.println("This is the catch statement. Howdy!");
		}
		System.out.println("Refresh Funding Details");
		driver.quit();
	}
	
}
