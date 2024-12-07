package org.ej.codedefinitions;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OperatingExpenses {
	
	WebDriver driver = new ChromeDriver();
	//Given Finsys_Login.feature   as reference and continue onto this step
	@Given("Finsys_Login.feature   as reference and continue onto this step")
	public void backgroundexpenses() {
		
		driver.get("http://localhost:90/finsys/login.html#");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("dummyfm");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("passw0rd");
		
		WebElement clickLogin = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
		clickLogin.click();
		
		try {
			WebElement display = driver.findElement(By.xpath("//div/*[1]"));
			
			if(display.isDisplayed()) 
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
		
		System.out.println("Welcome to the Main Page");
	}
	
	//When user clicks on  New in the Main Activity Window
	@When("user clicks on  New in the Main Activity Window")
	public void c1() {
		System.out.println("First Click");
	}
	
	//And the user scrolls down to the  form
	@And("the user scrolls down to the  form")
	public void s1() {
		System.out.println("Scroll 1");
	}
	
	
	//Then the Fixed Operating Expenses form is displayed
	@Then("the Fixed Operating Expenses form is displayed")
	public void expenseClick() {		
			driver.switchTo().defaultContent();
			WebElement form = driver.findElement(By.xpath("//a[@title='Fixed Operating Expenses']"));
			form.click();

		System.out.println("Click on the Operating expenses Form");
	}
	
	//When user clicks on New in the form window
	@When("user clicks on New in the form window")
	public void clickNew() {
		driver.switchTo().frame(0);
		WebElement newButton = driver.findElement(By.xpath("//span[normalize-space()='New']"));
		newButton.click();
		
		System.out.println("Clicked on New");
	}
	
	//When user clicks on the dropdown of Company
	@When("user clicks on the dropdown of Company")
	public void company() {
		WebElement company = driver.findElement(By.xpath("//select[@name='companyid']"));
		Select option = new Select(company);
		option.selectByVisibleText("Asus(671)");
		System.out.println("Select Company");
	}
	
	//And user selects an option stating the company
	@And("user selects an option stating the company")
	public void a1() {
		System.out.println("And print 1");
	}
	
	//When user clicks and enters Advertising and Admin
	@When("user clicks and enters Advertising and Admin")
	public void admin() {
		WebElement admin = driver.findElement(By.xpath("//input[@id='nn']/following-sibling::span/input"));
		admin.sendKeys("900");
		System.out.println("Advertising and Admin");
	}
	
	//When user clicks and enters Entertainment
	@When("user clicks and enters Entertainment")
	public void entertainment() {
		WebElement entertainment = driver.findElement(By.xpath("//input[@textboxname='entertainment']/following-sibling::span/input"));
		entertainment.sendKeys("1000");
		System.out.println("Entertainment");
	}
	
	//When user clicks and enters Internet
	@When("user clicks and enters Internet")
	public void internet() {
		WebElement internet = driver.findElement(By.xpath("//input[@textboxname='internet']/following-sibling::span/input"));
		internet.sendKeys("900");
		System.out.println("Internet");
	}
	
	//When user clicks and enters Office Expenses
	@When("user clicks and enters Office Expenses")
	public void Offexpenses() {
		WebElement expenses = driver.findElement(By.xpath("//input[@textboxname='office_expenses']/following-sibling::span/input"));
		expenses.sendKeys("900");
		System.out.println("Office Expenses");
	}
	
	//When user clicks and enters Rent
	@When("user clicks and enters Rent")
	public void rent() {
		WebElement rent = driver.findElement(By.xpath("//input[@textboxname='rent']/following-sibling::span/input"));
		rent.sendKeys("900");
		System.out.println("Rent");
	}
	
	//When user clicks and enters Light Bill
	@When("user clicks and enters Light Bill")
	public void lightBill() {
		WebElement bill = driver.findElement(By.xpath("//input[@textboxname='light_bill']/following-sibling::span/input"));
		bill.sendKeys("900");
		System.out.println("Light Bill");
	}
	
	//When user clicks and enters Repair and Maintenance
	@When("user clicks and enters Repair and Maintenance")
	public void repair() {
		WebElement repair = driver.findElement(By.xpath("//input[@textboxname='repair_maintenance']/following-sibling::span/input"));
		repair.sendKeys("900");
		System.out.println("Repair and Maintenanace");
	}
	
	//When user clicks and enters Telephone and communications
	@When("user clicks and enters Telephone and communications")
	public void telephone() {
		WebElement telephone = driver.findElement(By.xpath("//input[@textboxname='telephone_communication']/following-sibling::span/input"));
		telephone.sendKeys("900");
		System.out.println("Telephone and Communications");
	}
	
	//When user clicks and enters Travel
	@When("user clicks and enters Travel")
	public void travel() {
		WebElement travel = driver.findElement(By.xpath("//input[@textboxname='travel']/following-sibling::span/input"));
		travel.sendKeys("900");
		System.out.println("Travel");
	}
	
	//When user clicks and enters Utilities
	@When("user clicks and enters Utilities")
	public void utilities() {
		WebElement utilities = driver.findElement(By.xpath("//input[@textboxname='utilities']/following-sibling::span/input"));
		utilities.sendKeys("900");
		System.out.println("Utilities");
	}
	
	//When user clicks and enters Fuel Cost
	@When("user clicks and enters Fuel Cost")
	public void fuel() {
		WebElement fuel = driver.findElement(By.xpath("//input[@textboxname='fuel_cost']/following-sibling::span/input"));
		fuel.sendKeys("900");
		System.out.println("Fuel Cost");
	}
	
	//When user clicks on Total
	@When("user clicks on Total")
	public void totalClick() {
		WebElement total = driver.findElement(By.xpath("//div[@id='total']"));
		total.click();
		System.out.println("Total Click");
	}
	
	//And user clicks on the  Save button
	@And("user clicks on the  Save button")
	public void saveExpenses() {
		WebElement saveExp = driver.findElement(By.xpath("//a[@iconcls='icon-save']/span"));
		saveExp.click();
		System.out.println("Save");
	}
	
	//Then user can see the Operating Expenses details after the page has been refreshed
	@Then("user can see the Operating Expenses details after the page has been refreshed")
	public void refreshPage() {
		try 
		{
			Thread.sleep(5000);
			WebElement valid = driver.findElement(By.xpath("//div[contains(text(),'Asus')]"));
			
			
			
			if(valid.isDisplayed())
			{
				System.out.println("Entry Successful");
			}
			else
			{
				System.out.println("Entry Invalid. Try Again");
			}
		}
		catch (Exception e)
		{
			System.out.println("This is the catch print statement for the display.");
		}
		System.out.println("Reload and Saved");
		driver.quit();	}
	
}

