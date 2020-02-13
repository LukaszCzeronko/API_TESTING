Feature: Test date format

  Scenario Outline: Testing date format for HERE Api
    Given I have a base query parameters
    When I send request with specified date from current day <day>
    Then I expect that actual data for that day is <expectedData>
    Examples:
      | day | expectedData    |
      | -1  | "not available" |
      | 0   | "available"     |
      | 1   | "available"     |
      | 2   | "available"     |
      | 3   | "available"     |
      | 4   | "available"     |
      | 5   | "available"     |
      | 6   | "available"     |
      | 7   | "available"     |
      | 8   | "not available" |