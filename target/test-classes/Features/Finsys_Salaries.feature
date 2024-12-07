Feature: Managing new Salaries & Related Expenses


Background:
	Given user open the edge browser
	And user enters  the  URL "http://localhost:90/finsys"
	When user enters Valid "dummyfm" as Username
	And user enters Valid "passw0rd" as Password
	And clicks on Login  Button
	Then Application  should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page


	@money
	#Manage Salaries
	Scenario Outline: Creating and Managing entries related to Salaries and other Expenses of the given companies 

	When user clicks on Salaries & Related Expenses in the Main Activity Window

	And the Manage Salaries & Related Expenses sheet is displayed

	And user clicks  on the New Button in the Main Activity Window

	
	#New Form

	When user clicks and enters Number of Employees in Manufacturing Plant Employee
	And user clicks and enters Monthly Amount in Manufacturing Plant Employee

	When user clicks and enters Number of Employees in Marketing Force
	And user clicks and enters Monthly Amount in Marketing Force

	When user clicks and enters Number of Employees in Backend Employee
	And user clicks and enters Monthly Amount in Backend Employee

	When user clicks and enters Number of Employees in Sweeper
	And user clicks and enters Monthly Amount in Sweeper

	When user clicks and enters Number of Employees in Office Boys
	And user clicks and enters Monthly Amount in Office Boys

	When user clicks and enters Number of Employees in Management
	And user clicks and enters Monthly Amount in Management

	And user clicks on the Save button to save the Salary details
	Then user can see the Company Salary details after the page has been refreshed