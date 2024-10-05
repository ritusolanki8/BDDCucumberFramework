Feature: Login feature to automate test application

  @Login_test_case_1
  Scenario: Login with valid credentials
    Given user launches the browser with url
    When user enters the email id and click on next button
    Then user should be seeing the register page


