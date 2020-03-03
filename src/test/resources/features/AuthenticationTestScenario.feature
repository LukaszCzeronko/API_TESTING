Feature: Test authentication

  Scenario Outline: Testing authentication for HERE Api
    Given I have base query parameter "app_code"
    And I have base query parameter "name"
    And I have base query parameter "product"
    When I send request with specified query parameter name: "app_id" with value: <app_id>
    Then I expect response is <status>
    Examples:
      | app_id                  | status         |
      | "JIlgIjxb3334PrWXpDC3w" | "Unauthorized" |
      | "JIlgIjxb334PrWXpDC3"   | "Unauthorized" |
      | "JIlgIjxb_334PrWXpDC3w" | "Unauthorized" |
      | "JIlgIjxb334 PrWXpDC3w" | "Unauthorized" |

  Scenario Outline: Testing authentication for HERE Api
    Given I have base query parameter "app_id"
    And I have base query parameter "name"
    And I have base query parameter "product"
    When I send request with specified query parameter name: "app_code" with value: <app_code>
    Then I expect response is <status>
    Examples:
      | app_code                   | status         |
      | "QZ9AhazmUb1tY3uX40DQ"     | "Unauthorized" |
      | "QZvw9AhazmUb1tY3uX40DQ-"  | "Unauthorized" |
      | "/nQZvw9AhazmUb1tY3uX40DQ" | "Unauthorized" |
      | "QZvw9AhazmUb 1tY3uX40DQ"  | "Unauthorized" |

  Scenario Outline: Testing authentication for HERE Api
    Given I have base query parameter "app_id" <app_id>
    And I have base query parameter "product"
    And I have base query parameter "name"
    When I send request with specified query parameter name: "app_code" with value: <app_code>
    Then I expect response is <status>
    Examples:
      | app_id                   | app_code                 | status         |
      | "JIlgIjxb334PrWXpDC3w"   | "QZvw9AhazmUb1tY3uX40DQ" | "OK"           |
      | "QZvw9AhazmUb1tY3uX40DQ" | "JIlgIjxb334PrWXpDC3w"   | "Unauthorized" |
