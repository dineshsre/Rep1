Feature: Login Page feature
Scenario: Title of your Login Page
Given user is on the login page
When user gets the title of the page 
Then title of page is "Login - My Store"
 
Scenario: Forget Password link
Given user is on the login page
Then forget your password link is displayed   
 
Scenario: User Login with valid credentials
Given user is on the login page
When user enters username "imdmstar@gmail.com" 
And user enters userpassword "Silverct2"
And user clicks login button
Then user gets the title of the page
And title of page is "My account - My Store"