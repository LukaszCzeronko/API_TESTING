Feature: Test mandatory parameters

  Scenario Outline: Testing mandatory parameters for HERE Api
    Given I have base "app_id"
    And I have base "app_code"
    And I have base "product"
    When I send request with specified <name> <value>
    Then I expect response is <status>
    Examples:
      | name      | value    | status |
      | "name"    | "Berlin" | "OK"   |
      | "zipcode" | "99501"  | "OK"   |


  Scenario Outline: Testing mandatory parameters for HERE Api
    Given I have base "app_id"
    And I have base "app_code"
    And I have base "product"
    And I have base "latitude"
    And I have base "longitude"
    When I send request with specified "language" "polish"
    Then I expect response is <status>
    Examples:
      | status |
      | "OK"   |