Feature: Create Lead for LeafTaps


@sanity @smoke
Scenario: TC0001_login with positive credential

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on login button
Then HomePage Should be displayed
When Click on crm/sfa button
When Click on Leads
And Click on Create Lead
And Enter the Company Name as 'TestLeaf'
And Enter the First Name as 'Rekha'
And Enter the Last Name as 'D'
Then Submit button is clicked
