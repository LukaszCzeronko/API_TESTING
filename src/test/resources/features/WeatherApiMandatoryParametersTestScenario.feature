Feature: Test mandatory parameters

  Scenario Outline: Testing mandatory parameters for HERE Api
    Given I have base mandatory parameters
    When I send request with specified mandatory parameters for test <test>
    Then I expect that my access for test HERE Api is <status4>
    Examples:
      | test | status4     |
      | 0    | "available" |
      | 1    | "available" |
      | 2    | "available" |
      | 3    | "available" |