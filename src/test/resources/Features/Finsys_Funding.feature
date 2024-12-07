Feature: To keep track of the Funding received to a particular company

Background:
	Given user open the Edge browser
	And User enters  the URL "http://localhost:90/finsys"
	When user enters Valid "dummyfm" as username
	And user enters Valid "passw0rd" as password
	And clicks on LOGIN Button
	Then Application  should be on the  Home Page and user should be able to view Welcome dummy[FM] text on the top of the page.


	@funds
	#Funding
	Scenario Outline: Creating and organizing entries related to Funding of the companies given

	When user clicks on Funding in the Main Activity Window
	And user clicks on the New Button
	Then the Funding Form is Displayed

	
	#New Form
	
	When user clicks and enters Owners Cash Funding

	And user clicks and enters Commercial Loan

	When user clicks and enters Loan Interest

	And user clicks and enters Term in Months

	And user clicks on the EMI cell

	And user clicks on Save Button
	Then user can see the Funding details after the webpage has been refreshed