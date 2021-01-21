Feature: Create new address

  Scenario Outline User can add new address

    Given Open browser with https://prod-kurs.coderslab.pl/
    And User goes to the authentication page in store
    When User completes emailbox with cilomad271@izzum.com, password with ciri1234
    And Click on sign in button
    When User is on his account page and click Addresses
    When User is on his addresses page, click on Create new address button
    When User completes Alias None , Address Westminister, Zip SW1A 1AA, City London, Phone 123456789
    And User clicks on the SAVE button
    Then User see communicate Address successfully added!
    Examples:
      | email    | cilomad271@izzum.com |
      | password | ciri1234             |
      | Alias    | None                 |
      | Address  | Westminister         |
      | Zip      | SW1A 1AA             |
      | City     | London               |
      | Phone    | 123456789            |