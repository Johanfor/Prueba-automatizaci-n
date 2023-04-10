@REGRESSION @UI

Feature: Fill practice form

  @PRACTICE_FORM
  Scenario: Fill text information successfully
    Given The user is on the practice form page
    When The user fills all the information
    Then The user clicks on submit button

