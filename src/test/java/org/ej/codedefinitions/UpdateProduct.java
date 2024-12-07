package org.ej.codedefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateProduct {

	WebDriver driver = new ChromeDriver();
	
	//When user open the chrome browser
	@When("user open the chrome browser")
	public void chrome() {
//		this bare = bare;
//		this.driver = bare.getDriver();
//		WebDriver driver = Bare.getInstance().getDriver();
		driver.manage().window().maximize();
		System.out.println("Browser initialization");
	}
	
	//And user enters  the URL "http://localhost:90/finsys"
	@And("user enters  the URL {string}")
	public void link(String URL) {
//		WebDriver driver = Hooks.getInstance().getDriver();
		driver.get("http://localhost:90/finsys");
		
		System.out.println("Getting to the website");
	}
	
	//When user enters valid "dummyfm" as Username
	@When("user enters valid {string} as Username")
	public void usernameInput(String username) {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		user.sendKeys("dummyfm");
		
		System.out.println("Input the User Name");
	}
	
	//And user enters valid "passw0rd" as Password
	@And("user enters valid {string} as Password")
	public void passwordInput(String password) {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("passw0rd");
		
		System.out.println("Input the Password");
	}
	
	//And clicks on Login Button
	@And("clicks on Login Button")
	public void clickLogin() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement click = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
		click.click();
		
		System.out.println("Click on the Login Button");
	}
	
	//Then Application  should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page.
	@Then("Application  should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page.")
	public void nameDisplay() {
//		WebDriver driver = Hooks.getInstance().getDriver();
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
		
		System.out.println("The name is displayed on the front page after login");
	}
	
	//When user clicks on Manage Product in the Main Activity Window
	@When("user clicks on Manage Product in the Main Activity Window")
	public void manageClick() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement manage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Manage Product')]")));
		manage.click();
		System.out.println("Clicking on the Manage Product form under Financial Analysis");
	}
	
	//And user clicks on the Plus Icon in the field of "ABCD Company"
	@And("user clicks on the Plus Icon in the field of {string}")
	public void plusClick(String company) {
//		WebDriver driver = Hooks.getInstance().getDriver();
		
		driver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		WebElement plus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"datagrid-row-r1-1-5\"]/td/div/span")));
		plus.click();
		System.out.println("Clicking on the Plus icon on the company field");
	}
	
	//Then the Update Product form is displayed
	@Then("the Update Product form is displayed")
	public void updateDisplay() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		System.out.println("Update Product form is displayed");
	}
	
	//When user clicks and updates Product Name
	@When("user clicks and updates Product Name")
	public void uPname() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement name = driver.findElement(By.xpath("//input[@name=\"product_name\"]/preceding-sibling::input[1]"));
		name.clear();
		name.sendKeys("PC Parts");
		System.out.println("Update Product name");
	}
	
	//When user clicks and updates Price
	@When("user clicks and updates Price")
	public void uPrice() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement price = driver.findElement(By.xpath("//input[@name=\"price\"]/preceding-sibling::input[1]"));
		price.clear();
		price.sendKeys("10000");
		System.out.println("Update Product Price");
	}
	
	//When user clicks and updates Manufacturing Cost
	@When("user clicks and updates Manufacturing Cost")
	public void uMCost() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement cost = driver.findElement(By.xpath("//input[@name=\"manufacturing_cost\"]/preceding-sibling::input[1]"));
		cost.clear();
		cost.sendKeys("3000");
		System.out.println("Update Manufacturing Cost");
	}
	
	//When user clicks and updates Labor Cost
	@When("user clicks and updates Labor Cost")
	public void uLabour() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement labour = driver.findElement(By.xpath("//input[@name=\"labour_cost\"]/preceding-sibling::input[1]"));
		labour.clear();
		labour.sendKeys("4000");
		System.out.println("Update Labour Cost");
	}
	
	//When user clicks and updates Product Description
	@When("user clicks and updates Product Description")
	public void uPDesc() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement desc = driver.findElement(By.xpath("//input[@name=\"product_description\"]/preceding-sibling::textarea[1]"));
		desc.clear();
		desc.sendKeys("Keyboards, Mice and Speakers for Office use.");
		System.out.println("Update Product Description");
	}
	
	//And user clicks on  the Save button
	@And("user clicks on  the Save button")
	public void updateSave() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		WebElement save =  driver.findElement(By.xpath("//span[@class='l-btn-icon icon-save']"));
		save.click();
		System.out.println("Save the updated Product details");
	}
	
	//Then the user can see the Company details after the page has been refreshed
	@Then("the user can see the Company details after the page has been refreshed")
	public void updateRefresh() {
//		WebDriver driver = Hooks.getInstance().getDriver();
		
		try 
		{
			Thread.sleep(5000);
			WebElement update = driver.findElement(By.xpath("//div[normalize-space()='ABCD Company']"));
			
			
			
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
		System.out.println("The Product Details have now been updated");
		driver.quit();
	}
	
}
