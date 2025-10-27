Feature: Calculator Operations
  Scenario: Add two numbers
    Given a calculator
    When I add 5 and 3
    Then the result should be 8

  Scenario: Subtract two numbers
    Given a calculator
    When I subtract 5 from 10
    Then the result should be 5

  Scenario: Divide two numbers
    Given a calculator
    When I divide 10 by 2
    Then the result should be 5