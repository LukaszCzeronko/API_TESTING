Feature: Test WGS84 format

  Scenario Outline: Testing WGS84 compliant format for HERE Api
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    When I send request with specified "longitude" <longitude> "latitude" <latitude>
    Then I expect response is <status>
    Examples:
      | longitude | latitude | status          |
      | "0"       | "0"      | "OK"            |
      | "196"     | "0"      | "Bad Request" |
      | "-200"    | "0"      | "Bad Request" |
      | "160.9"   | "0"      | "OK"            |
      | "-160.9"  | "0"      | "OK"            |
      | "0"       | "111"    | "Bad Request" |
      | "0"       | "-100"   | "Bad Request" |
      | "0"       | "60.9"   | "OK"            |
      | "0"       | "-60.9"  | "OK"            |
