Feature: delete lead for Leaftaps

Scenario: TC0001_deletelead 

Given Open the chrome browser
And Load the application url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on crm/sfa button
When Click on Leads
When Click on Find Leads
When Click on Phone
And Enter phone number as '9'
And Click find Leads button
And Get Lead Id
And Click on Lead to Delete
And Click Delete Button
And Click Find Lead to check
And Send lead Id deleted
And Click Find Leads Deleted
Then Get Error Message


