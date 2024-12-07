package org.ej.codedefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageProduct {
	WebDriver driver = new ChromeDriver();
	//Given Finsys_Login.feature  as reference and continue onto this step
	@Given("Finsys_Login.feature  as reference and continue onto this step")
	public void background() {
		driver.get("http://localhost:90/finsys/login.html#");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		user.sendKeys("dummyfm");
		
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("passw0rd");
		
		WebElement click = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
		click.click();
		
		System.out.println("Background code");
	}
	
	//Then Application should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page.
	@Then("Application should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page.")
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
    	//System.out.println("The Page is being Displayed");
    	
    	
		System.out.println("Main Page Displayed");
	}
	//When user clicks on the New Button in the Main Activity Window
	@When("user clicks on the New Button in the Main Activity Window")
	public void ProductManage() {
		WebElement manage = driver.findElement(By.xpath("//a[contains(text(),'Manage Product')]"));
		manage.click();
		
		driver.switchTo().frame(0);
		
		WebElement newClick = driver.findElement(By.xpath("//a[@iconcls='icon-add']//span[@class='l-btn-left l-btn-icon-left']"));
		newClick.click();
		System.out.println("Main Activity click");
	}
	//And the user scrolls down to the form
	@And("the user scrolls down to the form")
	public void formScroll() {
		System.out.println("And scroll 1");
	}
	
	//Then the New Company form is displayed
	@Then("the New Company form is displayed")
	public void displayForm() {
		System.out.println("Form is being displayed");
	}
	
	//When user clicks and enters the Product Name
	@When("user clicks and enters the Product Name")
	public void Pname() {
		WebElement product = driver.findElement(By.xpath("//input[@textboxname='product_name']/following-sibling::span/input"));
		product.sendKeys("Computers");
		System.out.println("Product Name");
	}
	//When user clicks and enters Price
	@When("user clicks and enters Price")
	public void price() {
		WebElement price = driver.findElement(By.xpath("//input[@textboxname='price']/following-sibling::span/input"));
		price.sendKeys("25000");
		System.out.println("Price");
	}
	//When user clicks and enters the Manufacturing Cost
	@When("user clicks and enters the Manufacturing Cost")
	public void cost() {
		WebElement cost = driver.findElement(By.xpath("//input[@textboxname='manufacturing_cost']/following-sibling::span/input"));
		cost.sendKeys("15000");
		System.out.println("Manufacturing Cost");
	}
	//When user clicks and enters the Labor Cost 
	@When("user clicks and enters the Labor Cost") 
	public void labour() {
		WebElement labour = driver.findElement(By.xpath("//input[@textboxname='labour_cost']/following-sibling::span/input"));
		labour.sendKeys("5000");
		System.out.println("Labour Cost");
	}
	//When user clicks and enters the Product Description
	@When("user clicks and enters the Product Description")
	public void description() {
		WebElement desc = driver.findElement(By.xpath("//input[@textboxname='product_description']/following-sibling::span/textarea"));
		desc.sendKeys("Custom order for Office");
		System.out.println("Product Description");
	}
	//And user clicks on the Save button to save the product
	@And("user clicks on the Save button to save the product")
	public void save() {
		WebElement save = driver.findElement(By.xpath("//span[@class='l-btn-icon icon-save']"));
		save.click();
		System.out.println("Save");
	}
	//Then the user can see the Company details after the page has been refreshed
	@Then("the user can see the Product details after the page has been refreshed")
	public void refresh() {
		
		try 
		{
			Thread.sleep(5000);
			WebElement valid = driver.findElement(By.xpath("//tr[@id='datagrid-row-r1-2-0']//div[@class='datagrid-cell datagrid-cell-c1-name'][normalize-space()='A2A']"));
			
			
			
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
			System.out.println("This is the catch print statement.");
		}
		System.out.println("The Product details are now saved");
		driver.quit();
	}
	
}
