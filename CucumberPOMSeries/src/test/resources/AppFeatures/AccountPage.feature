Feature: Account Page feature

Background:
Given user has already logged in to application
|username|password|
|imdmstar@gmail.com|Silverct2|

Scenario: Accounts Page Title
Given user is on the accounts page
When user gets the title of the page
Then title of page is "My account - My Store"

Scenario: Account Sections Count
Given user is on the accounts page
Then user gets account section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY PERSONAL INFORMATION|
|MY ADDRESSES|
|MY WISHLISTS|
|Home|
And accounts section count must be 6