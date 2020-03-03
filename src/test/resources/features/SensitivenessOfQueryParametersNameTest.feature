Feature: Test Sensitiveness of query parameter name

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_code"
    And I have base query parameter "name"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual   | value                  | status        |
      | "App_id" | "JIlgIjxb334PrWXpDC3w" | "Bad Request" |
      | "APP_ID" | "JIlgIjxb334PrWXpDC3w" | "Bad Request" |

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_id"
    And  I have base query parameter "name"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual     | value                    | status        |
      | "App_code" | "QZvw9AhazmUb1tY3uX40DQ" | "Bad Request" |
      | "APP_CODE" | "QZvw9AhazmUb1tY3uX40DQ" | "Bad Request" |

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual | value    | status        |
      | "Name" | "Berlin" | "Bad Request" |
      | "NAME" | "Berlin" | "Bad Request" |

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "name"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual    | value         | status          |
      | "prodUct" | "observation" | "Bad Request" |
      | "PRODUCT" | "observation" | "Bad Request" |

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    And I have base query parameter "longitude"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual     | value | status          |
      | "Latitude" | "11"  | "Bad Request" |
      | "LATITUDE" | "11"  | "Bad Request" |

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    And I have base query parameter "latitude"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual      | value | status          |
      | "loNgitude" | "12"  | "Bad Request" |
      | "LONGITUDE" | "12"  | "Bad Request" |

  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual    | value   | status          |
      | "Zipcode" | "98343" | "Bad Request" |
      | "ZIPCODE" | "98343" | "Bad Request" |


  Scenario Outline: Testing sensitiveness of query parameter name
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    And I have base query parameter "name"
    When I send request with specified query parameter name: <actual> with value: <value>
    Then I expect response is <status>
    Examples:
      | actual           | value    | status |
      | "metRic"         | "true"   | "OK"   |
      | "METRIC"         | "true"   | "OK"   |
      | "Language"       | "polish" | "OK"   |
      | "LANGUAGE"       | "polish" | "OK"   |
      | "Oneobservation" | "true"   | "OK"   |
      | "ONEOBSERVATION" | "true"   | "OK"   |

