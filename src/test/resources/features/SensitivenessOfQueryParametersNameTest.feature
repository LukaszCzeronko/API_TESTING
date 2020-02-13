Feature: Test Sensitiveness of query parameter name

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have query parameters name with changed lower or upper case letters
    When I send request with specified name parameters <original2> changed to <actual2> with value <value2> in test <test3>
    Then I expect that my access to HERE Api is <status7>
    Examples:
      | test3 | status7         | original2        | actual2          | value2                   |
      | 0     | "not available" | "app_id"         | "App_id"         | "JIlgIjxb334PrWXpDC3w"   |
      | 1     | "not available" | "app_id"         | "APP_ID"         | "JIlgIjxb334PrWXpDC3w"   |
      | 2     | "not available" | "app_code"       | "App_code"       | "QZvw9AhazmUb1tY3uX40DQ" |
      | 3     | "not available" | "app_code"       | "APP_CODE"       | "QZvw9AhazmUb1tY3uX40DQ" |
      | 4     | "not available" | "name"           | "Name"           | "Berlin"                 |
      | 5     | "not available" | "name"           | "NAME"           | "Berlin"                 |
      | 6     | "not available" | "product"        | "prodUct"        | "observation"            |
      | 7     | "not available" | "product"        | "PRODUCT"        | "observation"            |
      | 8     | "not available" | "latitude"       | "Latitude"       | "11"                     |
      | 9     | "not available" | "latitude"       | "LATITUDE"       | "11"                     |
      | 10    | "not available" | "longitude"      | "loNgitude"      | "12"                     |
      | 11    | "not available" | "longitude"      | "LONGITUDE"      | "12"                     |
      | 12    | "not available" | "zipcode"        | "Zipcode"        | "98343"                  |
      | 13    | "not available" | "zipcode"        | "ZIPCODE"        | "98343"                  |
      | 14    | "available"     | "oneobservation" | "Oneobservation" | "true"                   |
      | 15    | "available"     | "oneobservation" | "ONEOBSERVATION" | "true"                   |
      | 16    | "available"     | "metric"         | "metRic"         | "true"                   |
      | 17    | "available"     | "metric"         | "METRIC"         | "true"                   |
      | 18    | "available"     | "language"       | "Language"       | "polish"                 |
      | 19    | "available"     | "language"       | "LANGUAGE"       | "polish"                 |
