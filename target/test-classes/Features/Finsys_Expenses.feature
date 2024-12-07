Feature: Managing Fixed Operating Expenses on Main Activity Page

Background:
	Given Finsys_Login.feature   as reference and continue onto this step

	@aqua
	#Fixed Operating Expenses
	Scenario Outline: Organizing and adding Fixed Operating Expenses in the form given
	When user clicks on  New in the Main Activity Window
	And the user scrolls down to the  form
	Then the Fixed Operating Expenses form is displayed

	#New Form
	When user clicks on New in the form window
	When user clicks on the dropdown of Company
	And user selects an option stating the company

	When user clicks and enters Advertising and Admin

	When user clicks and enters Entertainment

	When user clicks and enters Internet

	When user clicks and enters Office Expenses

	When user clicks and enters Rent

	When user clicks and enters Light Bill

	When user clicks and enters Repair and Maintenance

	When user clicks and enters Telephone and communications

	When user clicks and enters Travel

	When user clicks and enters Utilities

	When user clicks and enters Fuel Cost
	
	When user clicks on Total

	And user clicks on the  Save button
	Then user can see the Operating Expenses details after the page has been refreshed 