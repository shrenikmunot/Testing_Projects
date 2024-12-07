package org.ej.codedefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Shrek\\eclipse-workspace\\finsys_0\\finsys\\src\\test\\resources\\Features",
		tags = "@blaze",
		glue= {"org.ej.codedefinitions"}
		//plugin= {"org.common.codebehind.CustomStepListener"}
		
		)


public class TestRunner {
	
	
	

}