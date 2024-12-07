Feature: Login functionality for Finsys home page
Background:
    When user opens the "chrome" browser
    And user enters the URL "http://localhost:90/finsys/login.html"
    Then user should be on login page 
    
    
@smoke
Scenario Outline: Login functionality for valid credentials
    When user enters valid "<userid>" as userid
    And user enters valid "<password>" as password
    And user clicks on login button
    Then Application should be on Main Activity Page
    And user should be able to view logout link
    
 Examples:
 | userid | password |
 |dummyfm | passw0rd |
 
 
    #invalid-credential
Scenario Outline: Login functionality for invalid credentials
    When user enters invalid "<userid>" as userid
    And user enters invalid "<password>" as password
    And clicks on login button
    Then Application should display Error Message   
    
  Examples:
 | userid | password |
 | 10049   | Passw0rd|
 | 1       | P       |
 | 50505050|Paswwoorr|
 |         |         |
 | @#&~    | @#$%^   |
 | 20256414|293949512|
 | abcdefgh|ijklmnop |
 | aBcDeFgH|iJkLmYRS |
 | !@#!!@@ | !@#!!@@ |
 | 10099   | pasw    |
 