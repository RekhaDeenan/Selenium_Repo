Feature: Login Functionality for LeafTabs

@functional
Scenario Outline: TC001_Login with Postive Credential
    
    Given Enter the username as <username>
    And Enter the password as <password>
    When click on login button   
    Then HomePage Should be displayed
    Examples:
    |username|password|
    |'DemoSalesManager'|'crmsfa'|
    |'DemoCRM'|'crmsfa1'|
    
 @regression @smoke
Scenario Outline: TC002_Login with negative credential
 
   Given Enter the username as <username>
    And Enter the password as <password>
    When click on login button   
    But Errormesage Should be displayed
   Examples:
   |username|password|
    |'DemoCRM1'|'crmsfa123'|