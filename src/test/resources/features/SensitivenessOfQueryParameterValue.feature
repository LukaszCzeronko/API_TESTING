Feature: Test Sensitiveness of query parameter name

  @gites
  Scenario Outline: Testing sensitiveness of query parameter value
    Given I have query parameters value with changed lower or upper case letters
    When I send request with specified value parameters <original> changed to <actual> with name <value> in test <test1>
    Then I expect that my access to HERE Api is <status5>
    Examples:
      | test1 | status5         | original                 | actual                   | value      |
      | 0     | "Unauthorized"  | "JIlgIjxb334PrWXpDC3w"   | "JIlgIjxb334PrWXpDc3w"   | "app_id"   |
      | 1     | "Unauthorized"  | "JIlgIjxb334PrWXpDC3w"   | "JILGIJXB334PRWXPDC3W"   | "app_id"   |
      | 2     | "Unauthorized"  | "JIlgIjxb334PrWXpDC3w"   | "jilgijxb334prwxpdc3w"   | "app_id"   |
      | 3     | "Unauthorized"  | "QZvw9AhazmUb1tY3uX40DQ" | "QZvw9AhazmUb1tY3uX40dq" | "app_code" |
      | 4     | "Unauthorized"  | "QZvw9AhazmUb1tY3uX40DQ" | "QZVW9AHAZMUB1TY3UX40DQ" | "app_code" |
      | 5     | "Unauthorized"  | "QZvw9AhazmUb1tY3uX40DQ" | "qzvw9ahazmub1ty3ux40dq" | "app_code" |
      | 6     | "available"     | "Berlin"                 | "berlin"                 | "name"     |
      | 7     | "available"     | "Berlin"                 | "berliN"                 | "name"     |
      | 8     | "available"     | "Berlin"                 | "BERLIN"                 | "name"     |
      | 9     | "not available" | "observation"            | "Observation"            | "product"  |
      | 10    | "not available" | "observation"            | "OBSERVATION"            | "product"  |
      | 11    | "not available" | "forecast_7days"         | "forecast_7dayS"         | "product"  |
      | 12    | "not available" | "forecast_7days"         | "FORECAST_7DAYS"         | "product"  |
      | 13    | "not available" | "forecast_7Days_simple"  | "forecast_7Days_simple"  | "product"  |
      | 14    | "not available" | "forecast_7days_simple"  | "FORECAST_7DAYS_SIMPLE"  | "product"  |
      | 15    | "not available" | "forecast_hourly"        | "forecast_Hourly"        | "product"  |
      | 16    | "not available" | "forecast_hourly"        | "FORECAST_HOURLY"        | "product"  |
      | 17    | "not available" | "forecast_astronomy"     | "foreCast_astronomy"     | "product"  |
      | 18    | "not available" | "forecast_astronomy"     | "FORECAST_ASTRONOMY"     | "product"  |
      | 19    | "available"     | "polish"                 | "pOLISH"                 | "language" |
      | 20    | "available"     | "polish"                 | "POLISH"                 | "language" |
      | 21    | "available"     | "true"                   | "True"                   | "metric"   |
      | 22    | "available"     | "true"                   | "TRUE"                   | "metric"   |
      | 23    | "available"     | "false"                  | "False"                  | "metric"   |
      | 24    | "available"     | "false"                  | "FALSE"                  | "metric"   |
