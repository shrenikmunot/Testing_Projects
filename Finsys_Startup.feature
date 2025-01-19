Feature: Managing Funds required for Startups

Background:
	Given user opens the chrome browser
	When user enters  the URL "http://localhost:90/finsys"
	And user enters the valid "dummyfm" as Username
	And user enters valid "passw0rd" as the Password
	And clicks on the Login Button
	Then Application  should be on the HomePage and user should be able to view Welcome dummy[FM] text on the top of the page.

	@startup
	#Startup Funds
	Scenario Outline: Creating and maintaining entries related to funds of the Startups given

	When user clicks on Required Startup Funds in the Main Activity Window
	And user clicks on the New Button of the form
	Then the Startup Funds form is displayed

	#New Form
	When user clicks and selects an option from the Company dropdown 
	
	And user clicks and enters Software

	And user clicks and enters Salaries and Wages

	And user clicks and enters Insurance & Premium

	And user clicks and enters Inventory

	And user clicks and enters Legal & Accounting Fees

	And user clicks and enters Rent Deposits

	And user clicks and enters Advertisement 

	And user clicks and enters Licenses

	And user clicks and enters Other
	
	And user clicks on Total input box

	And user clicks on the Save Button
	Then the Startup Funds details are displayed