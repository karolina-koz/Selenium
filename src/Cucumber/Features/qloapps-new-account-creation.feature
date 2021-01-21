Feature: New account creation
  Scenario : New account
    Given user is on the main page
    And user goes to the authentication page
    When user completes email box with gvsdf22@mail.com
    And user click on create an account button
    When user completes first name John, last name Doe, password 12345
    And user clicks on register button
    Then success message is displayed