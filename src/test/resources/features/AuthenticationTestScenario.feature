Feature: Test authentication

  Scenario Outline: Testing authentication for HERE Api
    Given I have base query parameters with missing authentication credentials
    When I send request with specified credentials <app_id> and <app_code>
    Then I expect that my access to HERE Api is <status2>
    Examples:
      | app_id                   | app_code                   | status2        |
      | "JIlgIjxb334PrWXpDC3w"   | "QZvw9AhazmUb1tY3uX40DQ"   | "available"    |
      | "JIlgIjxb3334PrWXpDC3w"  | "QZvw9AhazmUb1tY3uX40DQ"   | "Unauthorized" |
      | "JIlgIjxb334PrWXpDC3"    | "QZvw9AhazmUb1tY3uX40DQ"   | "Unauthorized" |
      | "JIlgIjxb_334PrWXpDC3w"  | "QZvw9AhazmUb1tY3uX40DQ"   | "Unauthorized" |
      | "JIlgIjxb334 PrWXpDC3w"  | "QZvw9AhazmUb1tY3uX40DQ"   | "Unauthorized" |
      | "QZvw9AhazmUb1tY3uX40DQ" | "JIlgIjxb334PrWXpDC3w"     | "Unauthorized" |
      | "JIlgIjxb334PrWXpDC3w"   | "QZ9AhazmUb1tY3uX40DQ"     | "Unauthorized" |
      | "JIlgIjxb334PrWXpDC3w"   | "QZvw9AhazmUb1tY3uX40DQ-"  | "Unauthorized" |
      | "JIlgIjxb334PrWXpDC3w"   | "/nQZvw9AhazmUb1tY3uX40DQ" | "Unauthorized" |
      | "QZvw9AhazmUb"           | "QZvw9AhazmUb 1tY3uX40DQ"  | "Unauthorized" |
