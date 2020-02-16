Feature: Test duplicated parameters

  Scenario Outline: Testing duplicated parameters for HERE Api
    Given I have base "app_id"
    And I have base "app_id"
    And I have base "app_code"
    And I have base "name"
    And I have base "product"
    When I send request with specified <parameterName> <parameterValue>
    Then I expect response is <status>
    Examples:
      | parameterName | parameterValue           | status |
      | "app_id"      | "JIlgIjxb334PrWXpDC3w"   | "OK"   |
      | "app_id"      | "JIlgIjxb334PrkXpDC3w"   | "OK"   |
      | "app_code"    | "QZvw9AhazmUb1tY3uX40DQ" | "OK"   |
      | "app_code"    | "QZvw9AhazmUb1tY3uX40DQ" | "OK"   |
      | "name"        | "Berlin"                 | "OK"   |
      | "name"        | "Paris"                  | "OK"   |
      | "product"     | "observation"            | "OK"   |
      | "app_id"      | "JIlgIjxb334PrWXpDC3w"   | "OK"   |
