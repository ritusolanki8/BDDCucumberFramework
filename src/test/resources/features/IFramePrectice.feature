Feature: iFrame handling

  @iframe_handling
  Scenario: iFrame handling
    Given user launches the browser with new url
    When user enters the value in input iframe
    Then user should be seeing entered value

