Feature: Test mandatory parameters

  Scenario Outline: Testing mandatory parameters for HERE Api
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    When I send request with specified query parameter name: <name> with value: <value>
    Then I expect response is <status>
    Examples:
      | name      | value    | status |
      | "name"    | "Berlin" | "OK"   |
      | "zipcode" | "99501"  | "OK"   |


  Scenario Outline: Testing mandatory parameters for HERE Api
    Given I have base query parameter "app_id"
    And I have base query parameter "app_code"
    And I have base query parameter "product"
    And I have base query parameter "latitude"
    And I have base query parameter "longitude"
    When I send request with specified query parameter name: <name> with value: <value>
    Then I expect response is <status>
    Examples:
      | name       | value    | status |
      | "language" | "polish" | "OK"   |