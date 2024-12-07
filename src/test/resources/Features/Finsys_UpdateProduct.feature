Feature: Update existing product on the Main Activity Page

Background:
	When user open the chrome browser
	And user enters  the URL "http://localhost:90/finsys"
	When user enters valid "dummyfm" as Username
	And user enters valid "passw0rd" as Password
	And clicks on Login Button
	Then Application  should be on the Home Page and user should be able to view Welcome dummy[FM] text on the top of the page. 


	@blaze
	#Update Product
	Scenario Outline: Updating existing Product Details in the Manage Product form
	When user clicks on Manage Product in the Main Activity Window
	
	And user clicks on the Plus Icon in the field of "ABCD Company"
	Then the Update Product form is displayed

	When user clicks and updates Product Name 

	When user clicks and updates Price

	When user clicks and updates Manufacturing Cost 

	When user clicks and updates Labor Cost 

	When user clicks and updates Product Description

	And user clicks on  the Save button
	Then the user can see the Company details after the page has been refreshed
