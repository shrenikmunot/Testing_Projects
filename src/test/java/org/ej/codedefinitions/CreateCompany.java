package org.ej.codedefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCompany {
	
	WebDriver driver = new ChromeDriver();
	
		//Given Finsys_Login.feature as reference and continue onto this step
	    @Given("Finsys_Login.feature as reference and continue onto this step")
	    public void given() {
	    	
	    	driver.get("http://localhost:90/finsys/login.html#");
	    	driver.manage().window().maximize();
	    	
	    	WebElement user = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			user.sendKeys("dummyfm");
			
			WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			pass.sendKeys("passw0rd");
			
			WebElement click = driver.findElement(By.xpath("//a[@onclick='return ValidateLogin()']"));
			click.click();
	    }
	    
	    //When user arrives on Main Activity Page
	    @When("user arrives on Main Activity Page")
	    public void pageDisplay() {
	    	
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
	    	System.out.println("The Page is being Displayed");
	    
	    }
	    
	    
		//When user clicks on Manage Company under the Financial Analysis tab under the West column on the left side of the page
		@When("user clicks on Manage Company under the Financial Analysis tab under the West column on the left side of the page")
		public void newClick() {
			WebElement manage = driver.findElement(By.xpath("//a[contains(text(),'Manage Company')]"));
			manage.click();
			System.out.println("When Code 1 running");
		}
		
		//Then Main Activity window is loaded
		@And("Main Activity window is loaded")
		public void mainActivity() {
			System.out.println("Then code 1 running");
		}
		
		//When user clicks on New in the Main Activity Window
		@And("user clicks on New in the Main Activity Window")
		public void formClick() {
			
			driver.switchTo().frame(0);
			
			WebElement newButton = driver.findElement(By.xpath("//*[@id=\"toolbar\"]/a[1]/span/span[1]"));
			newButton.click();
			System.out.println("Click code 1 running");
		}
		
		//And the user  scrolls down to the form
		@And("the user  scrolls down to the form")
		public void scroller() {
			System.out.println("Scroll 1 is running");
			System.out.println(this.getClass().getMethods());
		}
		
		//Then the  New Company form is displayed
		@Then("the  New Company form is displayed")
		public void formDisplay() {
			System.out.println("Then code 2 running");
		}
		
		//When user clicks on the field of Company Name
		@And("user clicks on the field of Company Name")
		public void companyName() {
			System.out.println("Company Name code running");
		}
		
		//And user enters the company name
		@And("user enters the company name")
		public void nameAdd() {
			WebElement cName = driver.findElement(By.xpath("//input[@name='name']"));
			cName.sendKeys("Shrenik's Company");
			System.out.println("And Code 1 running");
		}
		
		//Then user clicks on the dropdown of Company Type
		@And("user clicks on the dropdown of Company Type")
		public void companyType() {
			WebElement cType = driver.findElement(By.xpath("//select[@id='companytype']"));
			Select option = new Select(cType);
			option.selectByVisibleText("Consultancy Services");
			System.out.println("Click Code 2 running");
		}
		
		//And user selects an option stating the company type from the dropdown menu
		@And("user selects an option stating the company type from the dropdown menu")
		public void dropdown1() {
			System.out.println("Dropdown Code 1 running");
		}
		
		//Then user clicks on the dropdown of Company Subtype
		@And("user clicks on the dropdown of Company Subtype")
		public void companySubtype() {
			WebElement cStype =  driver.findElement(By.xpath("//*[@id=\"subtype\"]/select"));
			Select opt = new Select(cStype);
			opt.selectByVisibleText("Market Research");
			System.out.println("Click Code 3 running");
		}
		
		//And user selects an option stating the company subtype from the dropdown menu
		@And("user selects an option stating the company subtype from the dropdown menu")
		public void dropdown2() {
			System.out.println("Dropdown Code 2 running");
		}
		
		//Then user clicks on the field of Address
		@And("user clicks on the field of Address")
		public void address() {
			WebElement address = driver.findElement(By.xpath("//input[@textboxname='address']/following-sibling::span/textarea"));
			address.sendKeys("Kothrud, Pune");
			System.out.println("Click Code 4 running"); 
		}
		
		//And user enters the address of the company
		@And("user enters the address of the company")
		public void addressEntry() {
			System.out.println("And Code 2 running");
		}
		
		//Then user clicks on the field of Phone
		@And("user clicks on the field of Phone")
		public void phone() {
			WebElement phone = driver.findElement(By.xpath("//input[@textboxname='phone']/following-sibling::span/input"));
			phone.sendKeys("1234567890");
			System.out.println("Click Code 5 running");
		}
		
		//And user enters the contact number of the company
		@And("user enters the contact number of the company")
		public void phoneEntry() {
			System.out.println("And Code 3 running");
		}
		
		//When user clicks on the field of Email
		@And("user clicks on the field of Email")
		public void email() {
			WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
			email.sendKeys("abcd@efg.com");
			System.out.println("Click Code 6 running");
		}
		
		//And user enters the email id of the company
		@And("user enters the email id of the company")
		public void emailEntry() {
			System.out.println("And Code 4 running");
		}
		
		//Then user clicks on the field of Pan Details
		@And("user clicks on the field of Pan Details")
		public void pan() {
			WebElement pan = driver.findElement(By.xpath("//input[@name='pan']"));
			pan.sendKeys("1A2B3C4D5E");
			System.out.println("Click Code 7 running");
		}
		
		//And user enters the PAN document details
		@And("user enters the PAN document details")
		public void panEntry() {
			System.out.println("And Code 5 running");
		}
		
		//Then user clicks on the field of Tin Details
		@And("user clicks on the field of Tin Details")
		public void tin() {
			WebElement tin = driver.findElement(By.xpath("//input[@name='tin']"));
			tin.sendKeys("2020202020");
			System.out.println("Click Code 8 running");
		}
		
		//And user enters the TIN document details
		@And("user enters the TIN document details")
		public void tinEntry() {
			System.out.println("And Code 6 running");
		}
		
		//Then user clicks on the field of Mobile
		@And("user clicks on the field of Mobile")
		public void mobile() {
			WebElement mobile = driver.findElement(By.xpath("//input[@textboxname='mobile']/following-sibling::span/input"));
			mobile.sendKeys("0101010101");
			System.out.println("Click Code 9 running");
		}
		
		//And user enters the mobile number
		@And("user enters the mobile number")
		public void mobileEntry() {
			System.out.println("And Code 7 running");
		}
		
		//Then user clicks on the field of Web Site
		@And("user clicks on the field of Web Site")
		public void website() {
			WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
			website.sendKeys("google.com");
			System.out.println("Click Code 10 running");
		}
		
		//And user enters the website link of the company
		@And("user enters the website link of the company")
		public void websiteEntry() {
			System.out.println("And Code 8 running");
		}
		
		//Then user clicks on the dropdown of Country
		@And("user clicks on the dropdown of Country")
		public void country() {
			WebElement country = driver.findElement(By.xpath("//*[@id=\"countryid\"]"));
			Select opt1 = new Select(country);
			opt1.selectByVisibleText("INDIA");
			System.out.println("Click Code 11 running");
		}
		
		//And user selects the option of the country from the dropdown menu
		@And("user selects the option of the country from the dropdown menu")
		public void dropdown3() {
			System.out.println("Dropdown Code 3 running");
		}
		
		//Then user clicks on the dropdown of State
		@And("user clicks on the dropdown of State")
		public void state() {
			WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
			Select opt2 = new Select(state);
			opt2.selectByVisibleText("MAHARASHTRA");
			System.out.println("Click Code 12 running");
		}
		
		//And user selects an option of the state from the dropdown menu
		@And("user selects an option of the state from the dropdown menu")
		public void dropdown4() {
			System.out.println("Dropdown Code 4 running");
		}
		
		//Then user clicks on the dropdown of City Name
		@And("user clicks on the dropdown of City Name")
		public void city() {
			WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
			Select opt3 = new Select(city);
			opt3.selectByVisibleText("PUNE");
			System.out.println("Click Code 13 running");
		}
		
		//And user selects an option of the city from the dropdown menu
		@And("user selects an option of the city from the dropdown menu")
		public void dropdown5() {
			System.out.println("Dropdown Code 5 running");
		}
		
		//Then user clicks on the field of Total Employee
		@And("user clicks on the field of Total Employee")
		public void employee() {
			WebElement emp = driver.findElement(By.xpath("//input[@textboxname='totalemployee']/following-sibling::span/input"));
			emp.sendKeys("100");
			System.out.println("Click Code 14 running");
		}
		
		//And user enters the number of employees in the company
		@And("user enters the number of employees in the company")
		public void employeeEntry() {
			System.out.println("And Code 9 running");
		}
		
		//And user clicks on the Save button
		@And("user clicks on the Save button")
		public void finalSave() {
			WebElement save =  driver.findElement(By.xpath("//a[@iconcls='icon-save']"));
			save.click();
			System.out.println("Finally Saved");
		}
		
		//Then user can see the Company details after the page has been refreshed
		@Then("user can see the Company details after the page has been refreshed")
		public void companyDisplay() {
			try 
			{
				Thread.sleep(5000);
				WebElement valid = driver.findElement(By.xpath("//*[@id=\"datagrid-row-r1-2-0\"]/td[1]/div"));
				
				
				
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
			System.out.println("Then Code 3 running");
			driver.quit();
		}
		
	}

