Feature: 
  As a user of the calculator program
  I want to have an addition method in the program
  So that I can add two numbers

  Scenario: Add two numbers
    Given I have calculator program
    When I choose to add 2 and 2
    Then the result of addition is 4