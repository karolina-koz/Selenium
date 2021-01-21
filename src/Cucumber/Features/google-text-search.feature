Feature: Google search

  Scenario: User can search any keyword

    Given Open browser with google.com
    When keyword selenium is entered in input field
    Then the first result should contain selenium
    And close browser
