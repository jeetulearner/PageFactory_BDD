Feature: Test login functionality

  Scenario Outline: Check login successful with valid credentials

    Given Browser is open
    And User is in login page
    When User enters "<username>" and "<password>"
    And User click on login
    Then User is navigated to home page

    Examples:
      | username | password |
      | Kundan   | 12345    |
      | Varsha   | 12345    |