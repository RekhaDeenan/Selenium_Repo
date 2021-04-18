Feature: Edit lead for Leaftaps

Scenario: TC0001_editlead 


And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on login button
Then HomePage Should be displayed
When Click on crm/sfa button
When Click on Leads
When Click on Find Leads
When Click on Phone
And Enter phone number as '99'
And Click find Leads button
And Select Lead
And Click Edit button
Given Enter Company Name as 'Infy'
When Click Submit 
Then Display Edit done


