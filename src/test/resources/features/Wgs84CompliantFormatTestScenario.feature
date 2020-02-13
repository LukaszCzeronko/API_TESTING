Feature: Test WGS84 format

  Scenario Outline: Testing WGS84 compliant format for HERE Api
    Given I have a base query parameters without given geographic longitude or latitude
    When I send request with specified longitude <longitude> and latitude <latitude>
    Then I expect that actual data status for given parameters is <status>
    Examples:
      | longitude | latitude | status          |
      | "0"       | "0"      | "available"     |
      | "196"     | "0"      | "not available" |
      | "-200"    | "0"      | "not available" |
      | "160.9"   | "0"      | "available"     |
      | "-160.9"  | "0"      | "available"     |
      | "0"       | "111"    | "not available" |
      | "0"       | "-100"   | "not available" |
      | "0"       | "60.9"   | "available"     |
      | "0"       | "-60.9"  | "available"     |
