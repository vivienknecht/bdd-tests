Feature: Boolean Calculator Operations
  Scenario: Perform OR operation
    Given a boolean calculator
    When I OR true and false
    Then the result should be true

  Scenario: Perform AND operation
    Given a boolean calculator
    When I AND true and false
    Then the result should be false

  Scenario: Perform AND operation failed
    Given a boolean calculator
    When I AND true and false
    Then the result should be true
