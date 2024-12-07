package org.ej.codedefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	 WebDriver driver=null;

	//When user opens the "chrome" browser
	@When("user opens the {string} browser")
	public void launchBrowser(String browserName) {
		
		
		 if (browserName.equalsIgnoreCase("chrome")) {
			 System.setProperty("webDriver.chrome.driver",
					 "C:\\Users\\Shrek\\Desktop\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 else if (browserName.equalsIgnoreCase("edge")) {
			 System.setProperty("webDriver.edge.driver",
						"C:\\Users\\Shrek\\Desktop\\msedgedriver.exe");
			 driver = new EdgeDriver();
		 }
		 else if (browserName.equalsIgnoreCase("firefox")) {
			 System.setProperty("webDriver.firefox.driver",
						"C:\\Users\\Shrek\\Desktop\\geckodriver.exe");
			 driver = new FirefoxDriver();
		 }
		        else {
			throw new RuntimeException("Unsupported Browser: "+ browserName);
		}
		 driver.manage().window().maximize();
		 
		 System.out.println("Code will come for this step:1");

	}
	//When user enters the URL "http://localhost:90/finsys/login.html"
	@When("user enters the URL {string}")
	public void inputURL(String url) {
		driver.get("http://localhost:90/finsys/login.html#");
		System.out.println("Code will come for this step:2");
	}
		
		//Then user should be on login page 
		@Then("user should be on login page")
		public void loginpage() {
			System.out.println("Then Code 1");
		}
	
	//Login functionality for valid username
	@When("user enters valid {string} as userid")
	public void validlogin(String validLogin) {
		
		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		user.sendKeys("dummyfm");
		
		System.out.println("Code will come for this step:3");
		}
	
	//Login functionality for valid password
	@When("user enters valid {string} as password")
	public void validpassword(String validPassword) {
		
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("passw0rd");
		
		System.out.println("Code will come for this step:4");
		}
	
		//When user clicks on login button
		@When("user clicks on login button")
		public void loginclick() {
			WebElement click = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
			click.click();
		
			System.out.println("Click 1");
		}
		
		//Then Application should be on Main Activity Page
		@Then("Application should be on Main Activity Page")
		public void mainpage() {
			System.out.println("Then Code 2");
		}
		
		//Then user should be able to view logout link
		@Then("user should be able to view logout link")
		public void logoutlink() {
			System.out.println("Then Code 3");
		}
	
	//Login functionality for invalid username
	@When("user enters invalid {string} as userid")
		public void invalidlogin(String invalidLogin) {
			System.out.println("Code will come for this step:5");
		}
		
		//Login functionality for invalid password
	@When("user enters invalid {string} as password")
		public void invalidpassword(String invalidPassword) {
			System.out.println("Code will come for this step:6");
		}
	}
	
	


