Feature: Manage Product on Main Activity Page

Background:
	Given Finsys_Login.feature  as reference and continue onto this step
	Then Application should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page. 

	@water
	#Manage Product
	Scenario Outline: Adding a New Product in the form given
	When user clicks on the New Button in the Main Activity Window
	And the user scrolls down to the form 
	Then the New Company form is displayed

	#New Form

	When user clicks and enters the Product Name 

	When user clicks and enters Price 
	
	When user clicks and enters the Manufacturing Cost 
	
	When user clicks and enters the Labor Cost 

	When user clicks and enters the Product Description

	And user clicks on the Save button to save the product
	Then the user can see the Product details after the page has been refreshed

	

	