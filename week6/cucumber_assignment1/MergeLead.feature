Feature: Merge lead for Leaftaps

Scenario: TC0001_Mergelead 

Given Open the chrome browser
And Load the application url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on crm/sfa button
When Click on Leads
When Click Merge Lead
And Click From Lead
And Get Window Handle for From Lead
And Enter Lead Name as 'b'
And Click find Leads
Given Get LeadID
When Click First lead
And Switch back window handle
When Click To lead
And Get Second Window Handle
And Send To Lead Id Name as 'a'
And Click find Leads
And Select First To Lead Id
And Switch back to Parent Window
And Click Merge button
And Alert Accept
And Click Search Leads
And Send Lead Id
And Search for entered Lead Id
When Get the Text Displayed
Then Verify text displayed










