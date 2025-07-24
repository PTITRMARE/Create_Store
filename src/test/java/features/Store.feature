Feature: User Login and Company Management

  Scenario:
    Given User opens the CStoreIQ website
    Then User enters username as "Pratik"
    Then User enters password as "Qa@123456"
    Then User clicks on login button

  Scenario Outline: User validates the store creation
    Given User is able to select a company
    Then User enters the company name as "<companyname>"
    And User clicks on the store module
    Then User clicks on the AddStore button
    Then User enters the store name
    And User enters the store address
    Then User enters the store phone number as "<storePhoneNumber>" and store email as "<Email>"
    And User is able to select the Company Back Office Interface
    Then User is able to select POS and MNSP device
    And User clicks on the StoreSave button
#    Then User clicks on the logout button

    Examples:
    |companyname     | storePhoneNumber    | Email         |
    |  SONY (1241)   |  +12342348932         | test@gmail.com|


