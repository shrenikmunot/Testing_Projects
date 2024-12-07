package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.ej.codedefinitions.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
	 TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@Before
	public void beforeSteps() {
		WebDriver driver = testContext.getWebDriverManager().createDriver();
		testContext.getWebDriverManager().createDriver();
		System.out.println("Setting up WebDriver");
	}
	
	@After
	public void afterSteps() {
		testContext.getWebDriverManager().quitDriver();
		System.out.println("Tearing down WebDriver");
	}
}
