Feature: Simple feature
 
Scenario: login_page Scenario
Given when user is on loginpage of Flipkart
When user click on search
And user search for samsung mobile
Then homepage displyed

Scenario:Home_page Scenario
Given  user is on HomePage of Flipkart
When user scrolls down the page 
And user Clicks on next button till the last page
Then last page will display