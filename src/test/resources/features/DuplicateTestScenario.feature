Feature: Test duplicated parameters

  Scenario Outline: Testing duplicated parameters for HERE Api
    Given I have a base query parameters
    When I send request with duplicated parameter <parameterName> = <parameterValue>
    Then I expect that duplicate is <status3>
    Examples:
      | parameterName | parameterValue           | status3     |
      | "app_id"      | "JIlgIjxb334PrWXpDC3w"   | "available" |
      | "app_id"      | "JIlgIjxb334PrkXpDC3w"   | "available" |
      | "app_code"    | "QZvw9AhazmUb1tY3uX40DQ" | "available" |
      | "app_code"    | "QZvw9AhazmUb1tY3uX40DQ" | "available" |
      | "name"        | "Berlin"                 | "available" |
      | "name"        | "Paris"                  | "available" |
      | "product"     | "observation"            | "available" |
      | "app_id"      | "JIlgIjxb334PrWXpDC3w"   | "available" |
