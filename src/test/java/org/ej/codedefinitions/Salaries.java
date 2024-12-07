package org.ej.codedefinitions;


//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Salaries {
	WebDriver driver = new EdgeDriver();
	
//	Given user open the edge browser
	@Given("user open the edge browser")
	public void edge() {
		driver.manage().window().maximize();
		System.out.println("Browser initialization");
	}
	
//	And user enters  the  URL "http://localhost:90/finsys"
	@And("user enters  the  URL {string}")
	public void navigate(String URL) {
		driver.get("http://localhost:90/finsys");
		System.out.println("Navigating to the website");
	}
	
//	When user enters Valid "dummyfm" as Username
	@When("user enters Valid {string} as Username")
	public void username(String username) {
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		user.sendKeys("dummyfm");
		System.out.println("Entering Username");
	}
	
//	And user enters Valid "passw0rd" as Password
	@And("user enters Valid {string} as Password")
	public void password(String password) {
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("passw0rd");
		System.out.println("Entering Password");
	}
	
//	And clicks on Login  Button
	@And("clicks on Login  Button")
	public void login() {
		WebElement click = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
		click.click();
		System.out.println("Login Button");
	}
	
//	Then Application  should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page
	@Then("Application  should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page")
	public void display() {
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
		System.out.println("Welcome to the Home Page");
	}
	
//	When user clicks on Salaries & Related Expenses in the Main Activity Window
	@When("user clicks on Salaries & Related Expenses in the Main Activity Window")
	public void click() {
		WebElement sal = driver.findElement(By.xpath("//a[contains(text(),'Salaries & Related Expenses')]"));
		sal.click();
		System.out.println("Click on Salaries Button");
	}
	
//	And the Manage Salaries & Related Expenses sheet is displayed
	@And("the Manage Salaries & Related Expenses sheet is displayed")
	public void formShow() {
		System.out.println("The Salaries form is displayed");
	}
	
//	And user clicks  on the New Button in the Main Activity Window
	@And("user clicks  on the New Button in the Main Activity Window")
	public void newButton() {
		driver.switchTo().frame(0);
		WebElement newB = driver.findElement(By.xpath("//a[@onclick='newItem()']"));
		newB.click();
		System.out.println("Clicked on the New Button");
	}
	
//	When user clicks and enters Number of Employees in Manufacturing Plant Employee
	@When("user clicks and enters Number of Employees in Manufacturing Plant Employee")
	public void mfgEmp() {
		WebElement mE = driver.findElement(By.xpath("//input[@id='total_plant_employee']/following-sibling::span/input"));
		mE.sendKeys("200");
		System.out.println("No of emp in Manufacturing");
	}
	
//	And user clicks and enters Monthly Amount in Manufacturing Plant Employee
	@And("user clicks and enters Monthly Amount in Manufacturing Plant Employee")
	public void mfgAmt() {
		WebElement mA = driver.findElement(By.xpath("//input[@id='plant_employee_monthly_salary']/following-sibling::span/input"));
		mA.sendKeys("5000");
		System.out.println("Monthly Amount in Manufacturing");
	}
	
//	When user clicks and enters Number of Employees in Marketing Force
	@When("user clicks and enters Number of Employees in Marketing Force")
	public void mktEmp() {
		WebElement mkE = driver.findElement(By.xpath("//input[@id='total_marketing_force']/following-sibling::span/input"));
		mkE.sendKeys("150");
		System.out.println("No of emp in Marketing");
	}
	
//	And user clicks and enters Monthly Amount in Marketing Force
	@And("user clicks and enters Monthly Amount in Marketing Force")
	public void mktAmt() {
		WebElement mkA = driver.findElement(By.xpath("//input[@id='marketing_force_monthly_salary']/following-sibling::span/input"));
		mkA.sendKeys("7500");
		System.out.println("Monthly Amount in Marketing");
	}
	
//	When user clicks and enters Number of Employees in Backend Employee
	@When("user clicks and enters Number of Employees in Backend Employee")
	public void itEmp() {
		WebElement iE = driver.findElement(By.xpath("//input[@id='total_backend_employee']/following-sibling::span/input"));
		iE.sendKeys("250");
		System.out.println("No of emp in IT");
	}
	
//	And user clicks and enters Monthly Amount in Backend Employee
	@And("user clicks and enters Monthly Amount in Backend Employee")
	public void itAmt() {
		WebElement iA = driver.findElement(By.xpath("//input[@id='backend_employee_monthly_salary']/following-sibling::span/input"));
		iA.sendKeys("10000");
		System.out.println("Monthly Amount in IT");
	}
	
//	When user clicks and enters Number of Employees in Sweeper
	@When("user clicks and enters Number of Employees in Sweeper")
	public void swEmp() {
		WebElement sE = driver.findElement(By.xpath("//input[@id='total_sweeper']/following-sibling::span/input"));
		sE.sendKeys("100");
		System.out.println("No of emp in Sweeper");
	}
	
//	And user clicks and enters Monthly Amount in Sweeper
	@And("user clicks and enters Monthly Amount in Sweeper")
	public void swAmt() {
		WebElement sA = driver.findElement(By.xpath("//input[@id='sweeper_monthly_salary']/following-sibling::span/input"));
		sA.sendKeys("2000");
		System.out.println("Monthly Amount in Sweeper");
	}
	
//	When user clicks and enters Number of Employees in Office Boys
	@When("user clicks and enters Number of Employees in Office Boys")
	public void obEmp() {
		WebElement oE = driver.findElement(By.xpath("//input[@id='total_office_boys']/following-sibling::span/input"));
		oE.sendKeys("100");
		System.out.println("No of emp in Office Boys");
	}
	
//	And user clicks and enters Monthly Amount in Office Boys
	@And("user clicks and enters Monthly Amount in Office Boys")
	public void obAmt() {
		WebElement oA = driver.findElement(By.xpath("//input[@id='office_boys_monthly_salary']/following-sibling::span/input"));
		oA.sendKeys("2500");
		System.out.println("Monthly Amount in Office Boys");
	}
	
//	When user clicks and enters Number of Employees in Management
	@When("user clicks and enters Number of Employees in Management")
	public void mgtEmp() {
		WebElement mgE = driver.findElement(By.xpath("//input[@id='total_management']/following-sibling::span/input"));
		mgE.sendKeys("200");
		System.out.println("No of emp in Management");
	}
	
//	And user clicks and enters Monthly Amount in Management
	@And("user clicks and enters Monthly Amount in Management")
	public void mgtAmt() {
		WebElement mgA = driver.findElement(By.xpath("//input[@id='management_monthly_salary']/following-sibling::span/input"));
		mgA.sendKeys("7500");
		System.out.println("Monthly Amount in Management");
	}
	
//	And user clicks on the Save button to save the Salary details
	@And("user clicks on the Save button to save the Salary details")
	public void save() {
		WebElement saveB = driver.findElement(By.xpath("//span[normalize-space()='Save']"));
		saveB.click();
		System.out.println("Saving all the details");
	}
	
//	Then user can see the Company Salary details after the page has been refreshed
	@Then("user can see the Company Salary details after the page has been refreshed")
	public void refresh() {
		try 
		{
			Thread.sleep(5000);
			WebElement update = driver.findElement(By.xpath("//div[normalize-space()='abc456']"));
			
			
			
			if(update.isDisplayed())
			{
				System.out.println("Entry Successfully Updated");
			}
			else
			{
				System.out.println("Entry Invalid. Try Again");
			}
		}
		catch (Exception e)
		{
			System.out.println("This is the catch print statement.");
		}
		
		System.out.println("Details refreshed and displayed");
		driver.quit();
	}
}
