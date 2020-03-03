Feature: Test Sensitiveness of query parameter name

  Scenario Outline: Testing sensitiveness of query parameter value
    Given I have base query parameter "app_code"
    And I have base query parameter "name"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <value> with value: <actual>
    Then I expect response is <status>
    Examples:
      | actual                 | value    | status         |
      | "JIlgIjxb334PrWXpDc3w" | "app_id" | "Unauthorized" |
      | "JILGIJXB334PRWXPDC3W" | "app_id" | "Unauthorized" |
      | "jilgijxb334prwxpdc3w" | "app_id" | "Unauthorized" |


  Scenario Outline: Testing sensitiveness of query parameter value
    Given I have base query parameter "app_id"
    And I have base query parameter "name"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <value> with value: <actual>
    Then I expect response is <status>
    Examples:
      | actual                   | value      | status         |
      | "QZvw9AhazmUb1tY3uX40dq" | "app_code" | "Unauthorized" |
      | "QZVW9AHAZMUB1TY3UX40DQ" | "app_code" | "Unauthorized" |
      | "qzvw9ahazmub1ty3ux40dq" | "app_code" | "Unauthorized" |

  Scenario Outline: Testing sensitiveness of query parameter value
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <value> with value: <actual>
    Then I expect response is <status>
    Examples:
      | actual   | value  | status |
      | "berlin" | "name" | "OK"   |
      | "berliN" | "name" | "OK"   |
      | "BERLIN" | "name" | "OK"   |

  Scenario Outline: Testing sensitiveness of query parameter value
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "name"
    When I send request with specified query parameter name: <value> with value: <actual>
    Then I expect response is <status>
    Examples:
      | actual                  | value     | status |
      | "Observation"           | "product" | "Bad Request"   |
      | "OBSERVATION"           | "product" | "Bad Request"   |
      | "forecast_7dayS"        | "product" | "Bad Request"   |
      | "FORECAST_7DAYS"        | "product" | "Bad Request"   |
      | "forecast_7Days_simple" | "product" | "Bad Request"   |
      | "FORECAST_7DAYS_SIMPLE" | "product" | "Bad Request"   |
      | "forecast_Hourly"       | "product" | "Bad Request"   |
      | "FORECAST_HOURLY"       | "product" | "Bad Request"   |
      | "foreCast_astronomy"    | "product" | "Bad Request"   |
      | "FORECAST_ASTRONOMY"    | "product" | "Bad Request"   |

  Scenario Outline: Testing sensitiveness of query parameter value
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "name"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <value> with value: <actual>
    Then I expect response is <status>
    Examples:
      | actual   | value      | status |
      | "pOLISH" | "language" | "OK"   |
      | "POLISH" | "language" | "OK"   |
      | "True"   | "metric"   | "OK"   |
      | "TRUE"   | "metric"   | "OK"   |
      | "False"  | "metric"   | "OK"   |
      | "FALSE"  | "metric"   | "OK"   |
