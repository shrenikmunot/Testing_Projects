Feature: Create New Company on the Main Activity Page

Background:
	Given Finsys_Login.feature as reference and continue onto this step
	When user arrives on Main Activity Page
	And user clicks on Manage Company under the Financial Analysis tab under the West column on the left side of the page
	Then Main Activity window is loaded
	
	@fire
	#New Company
	Scenario Outline: Adding a New Company in the form given
	When user clicks on New in the Main Activity Window
	And the user  scrolls down to the form 
	Then the  New Company form is displayed

	#New Form
	When user clicks on the field of Company Name 
	And user enters the company name 
	
	And user clicks on the dropdown of Company Type
	And user selects an option stating the company type from the dropdown menu

	And user clicks on the dropdown of Company Subtype
	And user selects an option stating the company subtype from the dropdown menu

	And user clicks on the field of Address
	And user enters the address of the company

	And user clicks on the field of Phone
	And user enters the contact number of the company

	And user clicks on the field of Email
	And user enters the email id of the company

	And user clicks on the field of Pan Details
	And user enters the PAN document details 

	And user clicks on the field of Tin Details
	And user enters the TIN document details

	And user clicks on the field of Mobile
	And user enters the mobile number

	And user clicks on the field of Web Site
	And user enters the website link of the company

	And user clicks on the dropdown of Country
	And user selects the option of the country from the dropdown menu

	And user clicks on the dropdown of State
	And user selects an option of the state from the dropdown menu

	And user clicks on the dropdown of City Name
	And user selects an option of the city from the dropdown menu

	And user clicks on the field of Total Employee
	And user enters the number of employees in the company

	And user clicks on the Save button
	Then user can see the Company details after the page has been refreshed
	