@web @regression @errormessage
  Feature: Error message feature

    Background:
      Given Incorrect credentials

  @error-1
  Scenario: Verify correct error message
    When I enter p into the text field
    And I click asc
    Then I verify that the login is invalid
    Then I see error message



