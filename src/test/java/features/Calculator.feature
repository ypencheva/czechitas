Feature: 
  As a user of the calculator program
  I want to have an addition and subtraction method in the program
  So that I can add two numbers, or subtract a number

  Scenario Outline: Add two numbers
    Given I have calculator program
    When I choose to add <arg1> and <arg2>
    Then the result of addition is <result>

    Examples: 
      | arg1 | arg2 | result |
      |    2 |    2 |      4 |
      |   -2 |   -2 |     -4 |
      |    0 |    2 |      2 |
      |    0 |    0 |      0 |

  Scenario: Subtract two numbers
    Given I have calculator program
    When I choose to subtract 2 from 4 
    Then the result of subtraction is 2
