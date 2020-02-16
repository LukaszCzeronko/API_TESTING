Feature: Test date format

  Scenario Outline: Testing date format for HERE Api
    Given I have base "app_id"
    And I have base "app_code"
    And  I have base "name"
    And I have base "product"
    When I send request with specified <day>
    Then I expect that actual data for that day is <status>
    Examples:
      | day | status  |
      | -1  | "false" |
      | 0   | "true"  |
      | 1   | "true"  |
      | 2   | "true"  |
      | 3   | "true"  |
      | 4   | "true"  |
      | 5   | "true"  |
      | 6   | "true"  |
      | 7   | "true"  |
      | 8   | "false" |