Feature: Test authentication

  Scenario Outline: Testing authentication for HERE Api
    Given I have base "app_code"
    And I have base "name"
    And I have base "product"
    When I send request with specified "app_id" <app_id>
    Then I expect response is <status>
    Examples:
      | app_id                  | status         |
      | "JIlgIjxb3334PrWXpDC3w" | "Unauthorized" |
      | "JIlgIjxb334PrWXpDC3"   | "Unauthorized" |
      | "JIlgIjxb_334PrWXpDC3w" | "Unauthorized" |
      | "JIlgIjxb334 PrWXpDC3w" | "Unauthorized" |

  Scenario Outline: Testing authentication for HERE Api
    Given I have base "app_id"
    And I have base "name"
    And I have base "product"
    When I send request with specified "app_code" <app_code>
    Then I expect response is <status>
    Examples:
      | app_code                   | status         |
      | "QZ9AhazmUb1tY3uX40DQ"     | "Unauthorized" |
      | "QZvw9AhazmUb1tY3uX40DQ-"  | "Unauthorized" |
      | "/nQZvw9AhazmUb1tY3uX40DQ" | "Unauthorized" |
      | "QZvw9AhazmUb 1tY3uX40DQ"  | "Unauthorized" |

  Scenario Outline: Testing authentication for HERE Api
    Given I have base "app_id" <app_id>
    And I have base "product"
    And I have base "name"
    When I send request with specified "app_code" <app_code>
    Then I expect response is <status>
    Examples:
      | app_id                   | app_code                 | status         |
      | "JIlgIjxb334PrWXpDC3w"   | "QZvw9AhazmUb1tY3uX40DQ" | "OK"           |
      | "QZvw9AhazmUb1tY3uX40DQ" | "JIlgIjxb334PrWXpDC3w"   | "Unauthorized" |
